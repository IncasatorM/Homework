package Homework4.Animal;

public class Animal {
    public static final int EMPTY_DISTENCE = 0;

    private static int animalsCount;



    public Animal(){
        animalsCount++;
    }
    public int getRunDistance()
    {
        return EMPTY_DISTENCE;
    }

    public int getSwimDistance() {
        return EMPTY_DISTENCE;
    }

    public static int getAnimalsCount() {
        return animalsCount;
    }

    public static void setAnimalsCount(int animalsCount) {
        Animal.animalsCount = animalsCount;
    }
}
