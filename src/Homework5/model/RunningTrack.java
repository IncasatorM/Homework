package Homework5.model;

import Homework5.interf.Obstrac;
import Homework5.interf.Participant;

import java.util.List;

public class RunningTrack implements Obstrac {

    private static final int DEFAULT_DIST_PERSON = 50;
    private static final int DEFAULT_DIST_CAT = 100;
    private static final int DEFAULT_DIST_ROBOT = 150;

    private final int length;

    public RunningTrack(int length) {
        this.length = length;
    }

    @Override
    public void overcome(List<Participant> participants) {
        participants.forEach(participant ->{
            participant.run();
            switch (participant.getType()){
                case CAT -> System.out.println("Cat " + ((Cat) participant).getName() + " did " + (length < DEFAULT_DIST_CAT ? "not overcome" : "overcome") + " the running track");
                case ROBOT -> System.out.println("Robot " + ((Robot) participant).getName() + " did " + (length < DEFAULT_DIST_ROBOT ? "not overcome" : "overcome") + " RunningTrack");
                case PERSON -> System.out.println("Person " + ((Person) participant).getName() + " did " + (length < DEFAULT_DIST_PERSON ? "not overcome" : "overcome") + " RunningTrack");
            }
        });

    }
}
