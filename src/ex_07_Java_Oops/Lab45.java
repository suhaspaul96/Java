package ex_07_Java_Oops;

public class Lab45 {
    public static void main(String[] args) {

        //creat the object of the class and access the attributes

        Lab44 obj = new Lab44();
        obj.name = "John";
        obj.age = 25;
        obj.gennder = "male";
        obj.phone = 1234567890;
        System.out.println("Name: " + obj.name);
        System.out.println("Age: " + obj.age);

        //call the methods
        obj.speak();
        obj.eat();

        //create another object of the class and access the attributes
        Lab44 obj2 = new Lab44();
        obj2.name = "Jane";
        obj2.age = 30;

        System.out.println("Name: " + obj2.name);

        System.out.println("Age: " + obj2.age);
        //call the methods
        obj2.speak();
        obj2.eat();
        //call the methods
        obj2.sleep();
        //call the methods
        obj2.speak();
        obj2.eat();
        //call the methods
    }

    //Attributes
    String name;
    int age;
    String gennder;
    long phone;

    //beahviour
    void speak() {
        System.out.println("I am speaking");
    }
}