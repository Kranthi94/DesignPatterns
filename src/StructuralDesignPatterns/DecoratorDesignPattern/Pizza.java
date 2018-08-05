// Created by Kranthi on 05/08/18.


// Question
//
//

// Things to Learn
//
//
package StructuralDesignPatterns.DecoratorDesignPattern;

public abstract class Pizza {

    public String description = "Plain Pizza";

    public String getDescription(){
        return description;
    }

    abstract int getCost();
}
