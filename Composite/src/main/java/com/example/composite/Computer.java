package com.example.composite;

public class Computer extends Producto{


    private String modelo;

    public Computer(String item, double precio, String modelo) {
        super(item, precio);
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
