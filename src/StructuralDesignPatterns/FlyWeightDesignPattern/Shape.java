package StructuralDesignPatterns.FlyWeightDesignPattern;

import java.awt.*;

public interface Shape {

    public void draw(Graphics graphics, int x1, int y1, int x2, int y2, Color color);
}
