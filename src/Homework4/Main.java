package Homework4;

import Homework4.Animal.Animal;
import Homework4.Animal.Cat;
import Homework4.Animal.Dog;

public class Main {
    public static void main(String[] args) {
        System.out.println("Running");
        final Cat catRun = new Cat();
        final Dog dogRun = new Dog();

        catRun.run(200);
        dogRun.run(300);

        System.out.println("Swimming");

        final Cat catSwim = new Cat();
        final Dog dogSwim = new Dog();

        catSwim.swim();
        dogSwim.swim(20);

        System.out.println(System.lineSeparator());
        System.out.println("Total animals:" + Animal.getAnimalsCount());





    }
}
