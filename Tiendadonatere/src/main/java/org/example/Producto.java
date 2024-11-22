package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Producto {
    private String nombreProducto;

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    private double precio;
    private int cantidadStock;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private int id;
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public Producto(String nombreProducto, double precio, int cantidadStock) {
        this.nombreProducto = nombreProducto;
        this.precio = precio;
        this.cantidadStock = cantidadStock;
    }


    public String getNombreProducto() {
        return nombreProducto;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidadStock() {
        return cantidadStock;
    }
}
