package com.example.patronesdedisenosemana1.encapsulaciones;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

@Component
public class AnimalFactory implements FactoryBean {
    private String tipo;
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public Animal getObject() throws Exception {
        if (("perro").equals(tipo)) {
            return new Perro();
        } else if (("gato").equals(tipo)) {
            return new Gato();
        }
        throw new IllegalArgumentException("Invalid animal type");
    }

    @Override
    public Class<?> getObjectType() {
        return Animal.class;
    }
}
