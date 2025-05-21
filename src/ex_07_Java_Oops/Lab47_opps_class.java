package ex_07_Java_Oops;

public class Lab47_opps_class {
    public static void main(String[] args) {

        cat c1 = new cat();
        c1.color = "pink";
        c1.name = "money";

        dog d1 = new dog();
        d1.color = "black";
        d1.name = "Namu";

        c1.running();
        d1.sleep();



    }
}
class cat{

    String name;
    String color;

    void running(){

        System.out.println("Hi am money");
    }
}

class dog{

    String name;
    String color;

    void sleep(){
        System.out.println("hi and I am namu");

    }
}