package clasesGenericas;

import java.util.ArrayList;
import java.util.List;

public class Notificacion<T> {

    private T objeto;
    private List<String> registroHistorico;

    public Notificacion(T objeto) {
        this.objeto = objeto;
        registroHistorico = new ArrayList<>();
    }

    public T getObjeto() {
        return objeto;
    }

    public void setObjeto(T objeto) {
        this.objeto = objeto;
    }

    public List<String> getRegistroHistorico() {
        return registroHistorico;
    }
}
