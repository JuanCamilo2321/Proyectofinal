package org.example;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

import java.io.File;
import java.io.IOException;

public class VerificarFactura {

    // Leer y verificar contenido del archivo PDF
    public static void verificarFactura(String rutaFactura) {
        try {

            PDDocument document = PDDocument.load(new File(rutaFactura));


            PDFTextStripper stripper = new PDFTextStripper();
            String texto = stripper.getText(document);


            System.out.println("Contenido de la factura: ");
            System.out.println(texto);


            if (texto.contains("Factura") && texto.contains("Total de la venta:")) {
                System.out.println("La factura contiene la información esperada.");
            } else {
                System.out.println("La factura no contiene todos los detalles.");
            }


            document.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
