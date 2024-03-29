package com.example.adapter;

public class Carro implements CarroInterface{

    String entidad;

    public Carro(String entidad) {
        this.entidad = entidad;
    }

    public String getEntidad() {
        return entidad;
    }

    public void setEntidad(String entidad) {
        this.entidad = entidad;
    }

    @Override
    public String quienSoy() {
        return "Soy " + entidad;
    }
}
