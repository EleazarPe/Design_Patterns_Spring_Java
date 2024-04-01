package com.example.semana2chainrespon.manejador;

public class GeneralSupportHandler extends AbstractSupportHandler {

    public GeneralSupportHandler(int level){
        this.level = level;
    }

    protected void handleRequest(String message) {
        System.out.println("GeneralSupportHandler: Processing request. " + message);

    }
}