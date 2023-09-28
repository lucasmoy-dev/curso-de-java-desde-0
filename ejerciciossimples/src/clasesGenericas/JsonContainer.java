package clasesGenericas;

import java.lang.reflect.Field;

public class JsonContainer<T> {

    private T objeto;

    public JsonContainer(T objeto) {
        this.objeto = objeto;
    }

    public T getObjeto() {
        return objeto;
    }

    public void setObjeto(T objeto) {
        this.objeto = objeto;
    }

    public String getJson() {
        return convertirAJson(objeto);
    }

    public static String convertirAJson(Object objeto) {
        StringBuilder jsonBuilder = new StringBuilder("{");
        Class<?> clase = objeto.getClass();
        Field[] campos = clase.getDeclaredFields();
        boolean primero = true;

        for (Field campo : campos) {
            if (!campo.isAccessible()) {
                campo.setAccessible(true);
            }
            try {
                Object valor = campo.get(objeto);
                if (!primero) {
                    jsonBuilder.append(",");
                }
                jsonBuilder.append("\"").append(campo.getName()).append("\":");
                if (valor == null) {
                    jsonBuilder.append("null");
                } else if (valor instanceof String) {
                    jsonBuilder.append("\"").append(valor).append("\"");
                } else {
                    jsonBuilder.append(valor.toString());
                }
                primero = false;
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }

        jsonBuilder.append("}");
        return jsonBuilder.toString();
    }
}
