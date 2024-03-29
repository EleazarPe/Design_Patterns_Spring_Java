package com.example.adapter;

public class SubmarineAdapter implements CarroInterface{

    Submarine submarine;

    public SubmarineAdapter(Submarine submarine) {
        this.submarine = submarine;
    }

    @Override
    public String quienSoy() {
        return "Soy " + submarine.entidad + " mi modelo es " + submarine.modelo;
    }
}
