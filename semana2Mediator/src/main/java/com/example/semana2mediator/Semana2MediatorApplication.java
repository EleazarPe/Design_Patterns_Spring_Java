package com.example.semana2mediator;

import com.example.semana2mediator.encapsulaciones.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Semana2MediatorApplication {

    public static void main(String[] args) {
        ApplicationContext aplication = SpringApplication.run(Semana2MediatorApplication.class, args);
        Commander commander= new CommanderImpl();
        ArmedUnit soldierUnit=new SoldierUnit(commander);
        ArmedUnit tankUnit=new TankUnit(commander);
        commander.registerArmedUnits(soldierUnit, tankUnit);
        commander.startAttack(soldierUnit);
        commander.startAttack(tankUnit);
        commander.ceaseAttack(soldierUnit);
        commander.startAttack(tankUnit);
    }

}
