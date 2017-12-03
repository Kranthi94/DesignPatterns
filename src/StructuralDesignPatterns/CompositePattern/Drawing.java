package StructuralDesignPatterns.CompositePattern;

import java.util.ArrayList;

public class Drawing implements Shape{

    private ArrayList<Shape> shapes = new ArrayList<>();

    public void addShape(Shape shape){
        shapes.add(shape);
    }

    public void clearDrawing(){
        shapes.clear();
    }

    @Override
    public void draw(String color) {
        for(Shape shape : shapes){
            shape.draw(color);
        }
    }
}
