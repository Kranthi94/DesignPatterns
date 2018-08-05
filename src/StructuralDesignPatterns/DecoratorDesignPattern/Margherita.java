// Created by Kranthi on 05/08/18.


// Question
//
//

// Things to Learn
//
//
package StructuralDesignPatterns.DecoratorDesignPattern;

public class Margherita extends Pizza {

    public Margherita(){
        description = "Margherita";
    }

    @Override
    int getCost() {
        return 50;
    }
}
