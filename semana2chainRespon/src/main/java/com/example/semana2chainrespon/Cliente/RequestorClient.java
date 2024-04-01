package com.example.semana2chainrespon.Cliente;

import com.example.semana2chainrespon.manejador.AbstractSupportHandler;
import com.example.semana2chainrespon.manejador.BillingSupportHandler;
import com.example.semana2chainrespon.manejador.GeneralSupportHandler;
import com.example.semana2chainrespon.manejador.TechnicalSupportHandler;

public class RequestorClient {

    public  static AbstractSupportHandler getHandlerChain(){


        AbstractSupportHandler technicalSupportHandler = new TechnicalSupportHandler( AbstractSupportHandler.TECHNICAL);
        AbstractSupportHandler billingSupportHandler = new BillingSupportHandler(  AbstractSupportHandler.BILLING);
        AbstractSupportHandler generalSupportHandler = new GeneralSupportHandler(AbstractSupportHandler.GENERAL);

        technicalSupportHandler.setNextHandler(billingSupportHandler);
        billingSupportHandler.setNextHandler(generalSupportHandler);

        return technicalSupportHandler;
    }

}