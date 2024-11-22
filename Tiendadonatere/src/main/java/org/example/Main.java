package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear algunos productos de ejemplo
        Producto producto1 = new Producto("Smartwath", 800.00, 1);
        Producto producto2 = new Producto("Phone", 700.00, 2);
        List<Producto> productos = new ArrayList<>();
        productos.add(producto1);
        productos.add(producto2);


        Venta venta = new Venta("Sancho panza", 1100.00); // Total de la venta


        Factura.generarFacturaPDF(venta, productos, "Sancho panza");


        VerificarFactura.verificarFactura("facturas/factura_" + System.currentTimeMillis() + ".pdf");
    }
}

