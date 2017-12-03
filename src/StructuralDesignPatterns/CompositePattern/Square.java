package StructuralDesignPatterns.CompositePattern;

public class Square implements Shape {

    @Override
    public void draw(String color) {
        System.out.println("Drawing Square with Color : " + color);
    }
}
