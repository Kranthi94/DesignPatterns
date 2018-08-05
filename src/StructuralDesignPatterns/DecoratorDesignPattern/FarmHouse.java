// Created by Kranthi on 05/08/18.


// Question
//
//

// Things to Learn
//
//
package StructuralDesignPatterns.DecoratorDesignPattern;

public class FarmHouse extends Pizza {

    public FarmHouse(){
        description = "Farm House";
    }

    @Override
    int getCost() {
        return 40;
    }
}
