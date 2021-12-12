package Bai_2;

public class Rectangle implements IShape
{
    private double length;
    private double width;

    public Rectangle() {
        length = width = 0;
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return this.length * this.width;
    }

    @Override
    public double getPerimeter() {
        return (this.length + this.width) * 2;
    }
}