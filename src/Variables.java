class Student {
    //instance variables

    String name;
    int age;

    //constructor to initialize instance variables
    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void displayDetails(){
        System.out.println("Name: "+name);
        System.out.println("age: "+age);
    }
}

public class Variables {
    public static void main(String[] args) {

        //creation of objects
        Student student1 = new Student ("Suhas", 26);
        Student student2 = new Student ("Akashta", 27);

        student1.displayDetails();
        student2.displayDetails();

    }
}



