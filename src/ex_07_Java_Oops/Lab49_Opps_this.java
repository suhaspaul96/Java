package ex_07_Java_Oops;

public class Lab49_Opps_this {
    public static void main(String[] args) {

        mobile m1 = new mobile("Oppo", "2016");
        mobile m2 = new mobile("Iphone", "2007");

        System.out.println(m1.name);
        System.out.println(m1.year);
        System.out.println(m2.name);
        System.out.println(m2.year);

    }
}

class mobile {

    String name;
    String year;

    mobile(String model_name, String year_of_launch) {

        this.name = model_name;
        this.year = year_of_launch;
    }

}