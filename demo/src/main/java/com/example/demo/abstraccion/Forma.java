package com.example.demo.abstraccion;

import com.example.demo.implementacion.Color;

public abstract class Forma {
    protected Color color;

    public Forma(Color color) {
        this.color = color;
    }
    
    public abstract void crear();
}
