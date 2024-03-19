package com.example.patronesdedisenosemana1.EjemploInterface;

public class Fruta implements Prototype{

    int color;
    String sabor;
    String temporada;

    public Fruta(int color, String sabor, String temporada) {
        this.color = color;
        this.sabor = sabor;
        this.temporada = temporada;
    }

    public Fruta(Fruta fruta) {
        this.color = fruta.color;
        this.sabor = fruta.sabor;
        this.temporada = fruta.temporada;
    };

    public int getColor() {
        return color;
    }

    public Fruta setColor(int color) {
        this.color = color;
        return this;
    }

    public String getSabor() {
        return sabor;
    }

    public Fruta setSabor(String sabor) {
        this.sabor = sabor;
        return this;
    }

    public String getTemporada() {
        return temporada;
    }

    public Fruta setTemporada(String temporada) {
        this.temporada = temporada;
        return this;
    }

    @Override
    public Fruta clone() {
        return new Fruta(this);

    }
}
