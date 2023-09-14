package Homework5;

import Homework5.enums.TestEnum;
import Homework5.interf.Participant;
import Homework5.interf.Shape;
import Homework5.model.*;
import Homework5.shape.Cirle;
import Homework5.shape.Square;
import Homework5.shape.Triangle;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {
    private static final double DEFAULT_SQUARE = 10;
    public static void main(String[] args) {

        Cirle cirle = new Cirle(DEFAULT_SQUARE);
        Triangle triangle = new Triangle(DEFAULT_SQUARE);
        Square square = new Square(DEFAULT_SQUARE);
        List<Shape> shapeList = Arrays.asList(cirle, triangle, square);

        double sum = 0;
        for (Shape shape : shapeList) {
            sum += shape.getSquare();
        }
        System.out.println("Sum area shape:" + sum);

        Person person = new Person("Denver");
        Cat cat = new Cat("Murka");
        Robot robot = new Robot("R2D2");

        RunningTrack runningTrack = new RunningTrack(200);
        Wall wall = new Wall(40);
        final List<Participant> particionsList = Arrays.asList(person, cat, robot);
        final var obstacleList = Arrays.asList(runningTrack, wall);

        obstacleList.forEach(obstacle -> obstacle.overcome(particionsList));


    }




}
