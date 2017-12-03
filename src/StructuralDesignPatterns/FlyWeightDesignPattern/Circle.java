package StructuralDesignPatterns.FlyWeightDesignPattern;

import java.awt.*;

public class Circle implements Shape{

    private boolean shouldFill;

    public Circle(boolean shouldFill){

        System.out.println("Circle is created");

        this.shouldFill = shouldFill;

        try {
            Thread.sleep(2000);
        }catch (Exception e){
            throw new RuntimeException("Creation Interrupted");
        }
    }

    @Override
    public void draw(Graphics circle, int x1, int y1, int x2, int y2, Color color) {

        circle.setColor(color);

        circle.drawOval(x1, y1, x2, y2);

        if(shouldFill){
            circle.fillOval(x1, y1, x2, y2);
        }
    }
}
