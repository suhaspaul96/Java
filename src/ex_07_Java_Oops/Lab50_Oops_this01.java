package ex_07_Java_Oops;

public class Lab50_Oops_this01 {
    public static void main(String[] args) {

        cars c1 = new cars("Getz", "Hyundai");
        cars c2 = new cars("Creta", "Hyundai");

        cars c3 = new cars("sumo", "Tata");
        cars c4 = new cars("scorpio", "Mahindra");

        System.out.println(c1.name);
        System.out.println(c1.car);
        System.out.println(c2.name);
        System.out.println(c2.car);
        System.out.println(c3.name);
        System.out.println(c3.car);

    }
}

class cars{

    String name;
    String car;

    cars(String model, String brand){

        this.name = model;
        this.car = brand;


    }

}