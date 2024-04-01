package com.example.semana2chainrespon.manejador;

public class BillingSupportHandler extends AbstractSupportHandler {

    public BillingSupportHandler(int level){
        this.level = level;
    }

    @Override
    protected void handleRequest (String message){
        System.out.println("BillingSupportHandler: Processing request. " + message);
    }

}