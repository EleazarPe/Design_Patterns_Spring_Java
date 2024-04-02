package com.example.semana2memento;

import com.example.semana2memento.encapsulaciones.EmpCaretaker;
import com.example.semana2memento.encapsulaciones.EmpMemento;
import com.example.semana2memento.encapsulaciones.EmpOriginator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Semana2MementoApplication {

    public static void main(String[] args) {
       ApplicationContext applicationContext= SpringApplication.run(Semana2MementoApplication.class, args);

        EmpOriginator empOriginator= new EmpOriginator(306,"Mark Ferguson", "131011789610","Sales Manager");
        EmpMemento empMemento=empOriginator.saveToMemento();
        EmpCaretaker empCaretaker=new EmpCaretaker();
        empCaretaker.addMemento(empMemento);

        System.out.println("\n Original EmpOriginator");
        empOriginator.printInfo();

        System.out.println("\n EmpOriginator after updating phone number");
        empOriginator.setEmpPhoneNo("131011888886");
        empMemento=empOriginator.saveToMemento();
        empCaretaker.addMemento(empMemento);
        empOriginator.printInfo();

        System.out.println("\n EmpOriginator after updating designation");
        empOriginator.setEmpDesignation("Senior Sales Manager");
        empMemento=empOriginator.saveToMemento();
        empCaretaker.addMemento(empMemento);
        empOriginator.printInfo();

        System.out.println("\n EmpOriginator after undoing designation update");
        empMemento=empCaretaker.getMemento();
        empOriginator.undoFromMemento(empMemento);
        empMemento=empCaretaker.getMemento();
        empOriginator.undoFromMemento(empMemento);
        empOriginator.printInfo();

        System.out.println("\n Original EmpOriginator after undoing phone number update");
        empMemento=empCaretaker.getMemento();
        empOriginator.undoFromMemento(empMemento);
        empOriginator.printInfo();

    }

}
