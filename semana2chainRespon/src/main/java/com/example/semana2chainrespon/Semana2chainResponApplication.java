package com.example.semana2chainrespon;

import com.example.semana2chainrespon.Cliente.RequestorClient;
import com.example.semana2chainrespon.manejador.AbstractSupportHandler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Semana2chainResponApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Semana2chainResponApplication.class, args);
        AbstractSupportHandler handler= RequestorClient.getHandlerChain();
        handler.receiveRequest(AbstractSupportHandler.TECHNICAL, " I'm having problem with my internet connectivity.");
        System.out.println("............................................");
        handler.receiveRequest(AbstractSupportHandler.BILLING, "Please resend my bill of this month.");
        System.out.println("............................................");
        handler.receiveRequest(AbstractSupportHandler.GENERAL, "Please send any other plans for home users.");

    }

}
