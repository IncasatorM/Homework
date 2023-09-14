package Homework5.model;

import Homework5.enums.TestEnum;
import Homework5.interf.Participant;

public class Robot implements Participant {

    private final String name;

    public Robot(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("Robot"+ name + "is run");

    }

    @Override
    public void jump() {
        System.out.println("Robot"+ name + "is run");

    }

    @Override
    public TestEnum getType() {
        return TestEnum.ROBOT;
    }

    public String getName() {
        return name;
    }
}
