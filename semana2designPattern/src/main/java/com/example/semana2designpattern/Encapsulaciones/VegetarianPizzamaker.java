package com.example.semana2designpattern.Encapsulaciones;

import com.example.semana2designpattern.Template.Pizzamaker;
import org.springframework.stereotype.Component;

@Component
public class VegetarianPizzamaker extends Pizzamaker {

    public void prepareIngredients() {
        System.out.println("Preparing mushroom, tomato slices, onions, and fresh basil leaves.");
    }

    public void addToppings() {
        System.out.println("Adding mozarella cheese and tomato sauce along with ingredients to crust.");
    }

}
