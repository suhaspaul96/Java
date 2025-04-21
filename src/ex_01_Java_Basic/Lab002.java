package ex_01_Java_Basic;

public class Lab002 {

    public static void main(String[] args) {

        System.out.println( 10 == 10);
        System.out.println( 10 < 10);
        System.out.println( 10 == 20);
        System.out.println( 10 >= 10);

        int balaji_salary = 12;
        boolean b = !(balaji_salary > 10 || balaji_salary < 5);
        System.out.println(b);

        char symbol = '@';

        char letter = 'A';
        System.out.println(letter);
    }
}
