// Created by Kranthi on 05/08/18.


// Question
//
//

// Things to Learn
//
//
package StructuralDesignPatterns.DecoratorDesignPattern;

public class CheeseDecorator extends ToppingDecorator {

    private Pizza pizza;

    public CheeseDecorator(Pizza pizza){
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " Cheese";
    }

    @Override
    int getCost() {
        return 2*pizza.getCost();
    }
}
