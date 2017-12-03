package StructuralDesignPatterns.FlyWeightDesignPattern;

import java.awt.*;

public class Line implements Shape{

    public Line(){

        System.out.println("Line is created");

        try {
            Thread.sleep(2000);
        }catch (Exception e){
            throw new RuntimeException("Creation Interrupted");
        }
    }

    @Override
    public void draw(Graphics line, int x1, int y1, int x2, int y2, Color color) {
        line.setColor(color);
        line.drawLine(x1, y1, x2, y2);
    }
}
