package ex_07_01_Java_Oops_Revision;

public class Car {

    String color;

    String brand;

    String model;

    int year;

    int speed;

    public void accelerate(int increment){
        speed += increment;
    }

    public void brake(int decrement){
        speed-= decrement;
    }
}
