package com.example.facade.Libreria;

public class Motor {

    private String modelo;

    private int HP;

    public Motor(String modelo, int HP) {
        this.modelo = modelo;
        this.HP = HP;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }
}
