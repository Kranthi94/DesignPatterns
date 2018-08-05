// Created by Kranthi on 05/08/18.


// Question
//
//

// Things to Learn
//
//
package StructuralDesignPatterns.DecoratorDesignPattern;

public class PaneerDecorator extends ToppingDecorator {

    private Pizza pizza;

    public PaneerDecorator(Pizza pizza){
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " Paneer";
    }

    @Override
    int getCost() {
        return 2*pizza.getCost();
    }
}
