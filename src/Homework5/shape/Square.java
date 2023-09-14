package Homework5.shape;

import Homework5.interf.Shape;

public class Square implements Shape {
    private final double length;

    public Square(double length) {
        this.length = length;
    }

    @Override
    public double getSquare() {
        return Math.pow(length, 2);
    }
}
