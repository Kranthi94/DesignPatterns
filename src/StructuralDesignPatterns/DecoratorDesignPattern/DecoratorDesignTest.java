// Created by Kranthi on 05/08/18.


// Question
//
//

// Things to Learn
//
//
package StructuralDesignPatterns.DecoratorDesignPattern;

public class DecoratorDesignTest {

    public static void main(String[] args){

        Pizza pizza = new FarmHouse();

        pizza = new PaneerDecorator(pizza);

        pizza = new CheeseDecorator(pizza);

        System.out.print(pizza.getCost());

        System.out.print(pizza.getDescription());
    }
}
