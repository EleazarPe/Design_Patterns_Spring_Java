package com.example.patronesdedisenosemana1;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class SingletonClase {

    private String valor;

    public void setValor(String valor){
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }
}
