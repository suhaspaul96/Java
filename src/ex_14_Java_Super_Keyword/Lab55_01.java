package ex_14_Java_Super_Keyword;

public class Lab55_01 {
    public static void main(String[] args) {

        dog d1 = new dog();
        d1.printcolor();
        d1.sound();
    }
}

class Animal {
    String color = "Black";

    Animal() {
        System.out.println("Animal constructor");
    }

    void sound() {

        System.out.println("Animal makes sound");
    }
}

class dog extends Animal{
    String color = "Brown";

    dog(){
        super();
        System.out.println("Dog constructor");
    }

    void printcolor(){
        System.out.println("child color: "+this.color);
        System.out.println("parent color: "+super.color);
    }

}