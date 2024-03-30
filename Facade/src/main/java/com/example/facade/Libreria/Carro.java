package com.example.facade.Libreria;

import java.util.List;

public class Carro {

    List<Silla> sillas;
    List<Rueda> ruedas;
    List<Puerta> puertas;
    Motor motor;
    String Modelo;

    public Carro(List<Silla> sillas, List<Rueda> ruedas, List<Puerta> puertas, Motor motor, String modelo) {
        this.sillas = sillas;
        this.ruedas = ruedas;
        this.puertas = puertas;
        this.motor = motor;
        Modelo = modelo;
    }

    public List<Silla> getSillas() {
        return sillas;
    }

    public void setSillas(List<Silla> sillas) {
        this.sillas = sillas;
    }

    public List<Rueda> getRuedas() {
        return ruedas;
    }

    public void setRuedas(List<Rueda> ruedas) {
        this.ruedas = ruedas;
    }

    public List<Puerta> getPuertas() {
        return puertas;
    }

    public void setPuertas(List<Puerta> puertas) {
        this.puertas = puertas;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String modelo) {
        Modelo = modelo;
    }
}
