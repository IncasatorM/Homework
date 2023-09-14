package Homework5.model;

import Homework5.enums.TestEnum;
import Homework5.interf.Participant;

public class Cat implements Participant {
    private final String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("Cat"+ name + "is run");


    }

    @Override
    public void jump() {
        System.out.println("Cat"+ name + "is run");

    }

    @Override
    public TestEnum getType() {
        return TestEnum.CAT;
    }

    public String getName() {
        return name;
    }
}
