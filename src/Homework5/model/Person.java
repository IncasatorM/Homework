package Homework5.model;

import Homework5.enums.TestEnum;
import Homework5.interf.Participant;

public class Person implements Participant {
    private final String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("Person"+ name + "is run");

    }

    @Override
    public void jump() {
        System.out.println("Person"+ name + "is jump");

    }

    public String getName() {
        return name;
    }

    @Override
    public TestEnum getType() {
        return TestEnum.PERSON;

    }
}
