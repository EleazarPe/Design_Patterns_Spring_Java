package com.example.adapter;

public class Submarine {

    String modelo;

    String entidad;

    public Submarine(String modelo, String entidad) {
        this.modelo = modelo;
        this.entidad = entidad;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getEntidad() {
        return entidad;
    }

    public void setEntidad(String entidad) {
        this.entidad = entidad;
    }
}
