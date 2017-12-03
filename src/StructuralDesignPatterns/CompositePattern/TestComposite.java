package StructuralDesignPatterns.CompositePattern;

public class TestComposite {

    public static void main(String[] args){

        Drawing drawing = new Drawing();

        drawing.addShape(new Triangle());

        drawing.addShape(new Circle());

        drawing.addShape(new Square());

        drawing.draw("#Red");

        drawing.clearDrawing();

        drawing.addShape(new Square());

        drawing.draw("#Blue");
    }
}
