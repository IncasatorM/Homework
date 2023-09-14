package Homework5.model;

import Homework5.interf.Obstrac;
import Homework5.interf.Participant;

import java.util.List;

public class Wall implements Obstrac {

    private static final int DEFAULT_HEIGHT_PERSON = 10;
    private static final int DEFAULT_HEIGHT_CAT = 20;
    private static final int DEFAULT_HEIGHT_ROBOT = 40;


    private final int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public void overcome(List<Participant> participants) {
        participants.forEach(participant -> {
            participant.jump();
            switch (participant.getType()){
                case CAT -> System.out.println("Cat " + ((Cat) participant).getName() + " did " + (height < DEFAULT_HEIGHT_CAT ? "not overcome" : "overcome") + " the wall");
                case ROBOT -> System.out.println("Robot"+ ((Robot)participant).getName()+"did" + (height < DEFAULT_HEIGHT_ROBOT ? "not overcome": "overcome")+ "the wall");
                case PERSON -> System.out.println("Robot"+ ((Person)participant).getName()+"did" + (height < DEFAULT_HEIGHT_PERSON ? "not overcome": "overcome")+ "the wall");
            }
        });


    }
}
