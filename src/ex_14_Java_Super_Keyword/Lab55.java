package ex_14_Java_Super_Keyword;

public class Lab55 {
    public static void main(String[] args) {

        //Super is a keyword its a refernce variable that allow to access methods variables and constructirs from parent
        //Super can be used with method
        //super can be used with variables
        //super can be used with the constructors

        vehicle v1 = new car();
        System.out.println();


    }
}

class vehicle{

    public int cars = 12;
    vehicle(){

        System.out.println("Constructor of vehicle");
    }

}

class car extends vehicle{

    car(){
        System.out.println("Constructor of vehicle");
    }
}