package Homework5.shape;

import Homework5.interf.Shape;

public class Cirle implements Shape {
    private final double radius;

    public Cirle(double radius) {
        this.radius = radius;
    }


    @Override
    public double getSquare() {
        return Math.PI * Math.pow(radius, 2);
    }
}
