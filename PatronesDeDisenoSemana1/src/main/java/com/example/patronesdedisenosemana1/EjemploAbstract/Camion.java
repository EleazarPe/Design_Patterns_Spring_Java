package com.example.patronesdedisenosemana1.EjemploAbstract;

public class Camion extends Vehiculo{

    public Camion(){

    };

    public Camion(Camion camion) {
        super(camion);
    }

    @Override
    public Vehiculo clone() {
        return new Camion(this);
    }
}
