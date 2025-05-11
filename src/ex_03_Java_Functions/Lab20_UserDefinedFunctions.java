package ex_03_Java_Functions;

public class Lab20_UserDefinedFunctions {
    public static void main(String[] args) {
        //JVM is always running in our ram that calls the Main() method
        //There are 4 types of Functions in Java
        /*
        1. Without para without return type
        2. Without para with return type
        3. with para without return type
        4. with para with return type
        */
        /*main();
        greet();
        String s = greetwithhello();
        System.out.println(s);
        int a = num();
        System.out.println(a);*/

        name("suhas");
        surname("Poul");
        age(26);
        salary(410000);

       int solution =  sumofnum(10,20);
        System.out.println("sum of numbers ae: "+solution);


        double pack = newsalary(410000,950000);

        System.out.println("new package is: "+pack);

    }

    //declartion of an fucntion
    static void main() {
        System.out.println("Hi another looks like a main ");
    }

    //1. ex of without para without return type
    static void greet() {
        System.out.println("Hi this is greet");
    }

    //2. Without para with return type
    static String greetwithhello() {
        return "Hi I am ex of Without para with return type";
    }

    static int num() {
        return 10;
    }

    //3. With Para wihout return type  90% of the time you will be using this one
    static void name(String name) {

        System.out.println("Hi my name is: "+name);
    }

    static void surname(String name1){
        System.out.println("My surname is: "+name1);
    }

    static void age(int num){
        System.out.println("My age is: "+num);
    }

    static void salary(long sal){
        System.out.println("and my ctc is: "+sal);
    }

    //4. With Para with return type

    public static int sumofnum(int a, int b){
        return a+b;
    }

    public static double newsalary(double old, double new1){
        return old+new1;
    }

}
