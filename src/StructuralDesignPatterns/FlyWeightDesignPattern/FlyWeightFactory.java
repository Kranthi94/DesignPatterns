package StructuralDesignPatterns.FlyWeightDesignPattern;

import java.util.HashMap;

public class FlyWeightFactory {

    private static enum ShapeType{
        CIRCLE_FILL, CIRCLE_NOFILL, LINE
    }

    private HashMap<ShapeType, Shape> shapes = new HashMap<>();

    public Shape getShape(ShapeType shapeType){

        Shape shape = shapes.get(shapeType);

        if(shape == null){

            if(shapeType == ShapeType.CIRCLE_FILL){
                shape = new Circle(true);
            }else if(shapeType == ShapeType.CIRCLE_NOFILL){
                shape = new Circle(false);
            }else if(shapeType == ShapeType.LINE){
                shape = new Line();
            }

            shapes.put(shapeType, shape);
        }

        return shape;
    }
}
