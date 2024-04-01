package com.example.semana2chainrespon.manejador;

public class TechnicalSupportHandler extends AbstractSupportHandler{
    public TechnicalSupportHandler(int level){
        this.level = level;
    }

    protected void handleRequest(String message) {
        System.out.println("TechnicalSupportHandler: Processing request " + message);

    }
}
