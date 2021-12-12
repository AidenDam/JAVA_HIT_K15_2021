package Bai_2;

import java.util.*;

public class Circle implements IShape
{
    private double radius;

    public Circle() {
        radius = 0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return (double) 3.14 * this.radius * this.radius;
    }

    @Override
    public double getPerimeter() {
        return  (double) 2 * 3.14 * this.radius;
    }
}