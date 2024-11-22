package org.example;

import java.util.List;

public class Informe {
    public static void generarInformeProveedores(List<Proveedor> proveedores) {
        System.out.println("Informe de Proveedores:");
        for (Proveedor proveedor : proveedores) {
            System.out.println("Proveedor: " + proveedor.getNombre());
            System.out.println("Productos asociados:");
            proveedor.mostrarProductos();
        }
    }
}
