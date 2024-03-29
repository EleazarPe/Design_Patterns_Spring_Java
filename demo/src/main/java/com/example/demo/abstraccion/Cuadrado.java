package com.example.demo.abstraccion;

import com.example.demo.implementacion.Color;

public class Cuadrado extends Forma {

    public Cuadrado(Color color) {
        super(color);
    }

    @Override
    public void crear(){
        System.out.println("Creando Cuadrado");
        color.agregarColor();
    }
}
