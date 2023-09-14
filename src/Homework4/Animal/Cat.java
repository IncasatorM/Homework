package Homework4.Animal;

public class Cat extends Animal{
    private int runDistance;
    private int swimDistance;

    public void run(int distance){
        System.out.println("Cat ran" + distance + "m.");
    }

    public void swim(){
        System.out.println("Cat cant swim.");
    }


}
