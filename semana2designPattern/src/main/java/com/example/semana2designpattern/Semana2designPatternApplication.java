package com.example.semana2designpattern;

import com.example.semana2designpattern.Encapsulaciones.VegetarianPizzamaker;
import com.example.semana2designpattern.Template.Pizzamaker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Semana2designPatternApplication {

    public static void main(String[] args) {
        ApplicationContext context =  SpringApplication.run(Semana2designPatternApplication.class, args);
        System.out.println("-----Making Veg Pizza-----");
        Pizzamaker vegPizzaMaker = new VegetarianPizzamaker();
        vegPizzaMaker.makePizza();

    }

}
