package Homework5.shape;

import Homework5.interf.Shape;

public class Triangle implements Shape {
    private final double lenght;

    public Triangle(double lenght) {
        this.lenght = lenght;
    }

    @Override
    public double getSquare() {
        return Math.pow(lenght, 2) * Math.sqrt(lenght);
    }
}
