package com.example.patronesdedisenosemana1.EjemploAbstract;

public class Carro extends Vehiculo{

    private int velocidad;

    public Carro(){
    };

    public Carro(Carro carro){
        super(carro);
        this.velocidad = carro.getVelocidad();
    }

    @Override
    public Vehiculo clone() {
        return new Carro(this);
    }

    public int getVelocidad() {
        return velocidad;
    }

    public Carro setVelocidad(int velocidad) {
        this.velocidad = velocidad;
        return this;
    }
}
