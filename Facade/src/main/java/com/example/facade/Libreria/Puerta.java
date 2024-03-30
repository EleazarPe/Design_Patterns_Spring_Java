package com.example.facade.Libreria;

public class Puerta {

    String modelo;
    String color;

    public Puerta(String modelo, String color) {
        this.modelo = modelo;
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
