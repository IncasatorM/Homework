package Homework4.Animal;

public class Dog extends Animal{
    private int distance;
    private int swimDistance;

    public void run(int distance){
        System.out.println("Dog run" + distance + "m");
    }

    public void swim(int distance){
        System.out.println("Dog swim" + distance + "m");
    }
}
