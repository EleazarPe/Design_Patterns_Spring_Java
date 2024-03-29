package com.example.demo.abstraccion;

import com.example.demo.implementacion.Color;

public class Circulo extends Forma{

    public Circulo(Color color) {
        super(color);
    }

    @Override
    public void crear(){
        System.out.println("Creando Circulo");
        color.agregarColor();
    }
}
