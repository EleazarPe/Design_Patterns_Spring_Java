package com.example.patronesdedisenosemana1.encapsulaciones;

import org.springframework.stereotype.Component;

@Component
public class EsferaFactory implements FiguraFactory{
    public Figura crearFigura(){
        return new Esfera();
    }
}
