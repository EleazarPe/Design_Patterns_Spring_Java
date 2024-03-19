package com.example.patronesdedisenosemana1.EjemploAbstract;

public abstract class Vehiculo {

    private String marca;
    private String modelo;
    private int puertas;
    private int ruedas;
    private float peso;
    private int asientos;

    protected Vehiculo(){

    }

    protected Vehiculo(Vehiculo vehiculo){
        this.marca = vehiculo.marca;
        this.modelo = vehiculo.modelo;
        this.puertas = vehiculo.puertas;
        this.ruedas = vehiculo.ruedas;
        this.peso = vehiculo.peso;
        this.asientos = vehiculo.asientos;
    }

    public abstract Vehiculo clone();

    public String getMarca() {
        return marca;
    }

    public Vehiculo setMarca(String marca) {
        this.marca = marca;
        return this;
    }

    public String getModelo() {
        return modelo;
    }

    public Vehiculo setModelo(String modelo) {
        this.modelo = modelo;
        return this;
    }

    public int getPuertas() {
        return puertas;
    }

    public Vehiculo setPuertas(int puertas) {
        this.puertas = puertas;
        return this;
    }

    public int getRuedas() {
        return ruedas;
    }

    public Vehiculo setRuedas(int ruedas) {
        this.ruedas = ruedas;
        return this;
    }

    public float getPeso() {
        return peso;
    }

    public Vehiculo setPeso(float peso) {
        this.peso = peso;
        return this;
    }

    public int getAsientos() {
        return asientos;
    }

    public Vehiculo setAsientos(int asientos) {
        this.asientos = asientos;
        return this;
    }
}
