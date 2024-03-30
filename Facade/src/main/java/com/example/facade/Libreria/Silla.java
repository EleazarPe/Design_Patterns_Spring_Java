package com.example.facade.Libreria;

public class Silla {

    private String modelo;
    private String Tamano;
    private String Color;

    public Silla(String modelo, String tamano, String color) {
        this.modelo = modelo;
        Tamano = tamano;
        Color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTamano() {
        return Tamano;
    }

    public void setTamano(String tamano) {
        Tamano = tamano;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }
}
