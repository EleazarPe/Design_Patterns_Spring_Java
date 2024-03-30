package com.example.facade;

import com.example.facade.Libreria.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Simple {

    public Carro crearCarroXV(String color){

        Silla s1 = new Silla("S100","Medio", color);
        Silla s2 = new Silla("S100","Medio", color);
        Silla s3 = new Silla("S100","Medio", color);
        Silla s4 = new Silla("S100","Medio", color);

        List<Silla> sillas = new ArrayList<>();
        sillas.add(s1);
        sillas.add(s2);
        sillas.add(s3);
        sillas.add(s4);

        Rueda r1 = new Rueda("R200", "Venimax", new Date());
        Rueda r2 = new Rueda("R200", "Venimax", new Date());
        Rueda r3 = new Rueda("R200", "Venimax", new Date());
        Rueda r4 = new Rueda("R200", "Venimax", new Date());

        List<Rueda> ruedas = new ArrayList<>();
        ruedas.add(r1);
        ruedas.add(r2);
        ruedas.add(r3);
        ruedas.add(r4);

        Puerta p1 = new Puerta("P121", color);
        Puerta p2 = new Puerta("P121", color);
        Puerta p3 = new Puerta("P121", color);
        Puerta p4 = new Puerta("P121", color);

        List<Puerta> puertas = new ArrayList<>();
        puertas.add(p1);
        puertas.add(p2);
        puertas.add(p3);
        puertas.add(p4);

        Motor motor = new Motor("M6540", 50);

        return new Carro(sillas, ruedas, puertas, motor, "CXV");
    }

}
