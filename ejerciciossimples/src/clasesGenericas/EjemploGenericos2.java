import clasesGenericas.Notificacion;
import clasesGenericas.Producto;
import clasesGenericas.Proveedor;

import java.util.ArrayList;
import java.util.List;

public class EjemploGenericos2 {

    public static void main(String[] args) {
        Producto producto = new Producto();
        producto.setNombre("Macbook Pro");
        producto.setId("123");
        Notificacion<Producto> notificacion = new Notificacion<>(producto);
        notificacion.getRegistroHistorico().add("Recibimos la notificacion en el servicio de productos");
        notificacion.getObjeto().getNombre();
        System.out.println(notificacion.getObjeto().getNombre());
        hacerAlgo(notificacion);

        System.out.println(notificacion.getRegistroHistorico());

        Proveedor prov = new Proveedor();
        prov.setNombre("ACME");
        Notificacion<Proveedor> not2 = new Notificacion<Proveedor>(prov);
        System.out.println(not2.getObjeto().getNombre());

    }

    public static void hacerAlgo(Notificacion notificacion){
        notificacion.getRegistroHistorico().add("Paso por el departamento de compras");
    }
}