package com.example.composite;

public class Producto implements Caja{

    private String item;
    private double precio;

    public Producto(String item, double precio) {
        this.item = item;
        this.precio = precio;
    }

    @Override
    public double calcularPrecio() {
        return precio;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
