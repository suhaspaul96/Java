package Practise;

import java.util.Scanner;

public class Practise0306 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");

        String s = sc.next();

        String rev = "";

        for(int i = s.length()-1;i>=0;i--){

            rev = rev+s.charAt(i);
        }
        System.out.println("Reverse string is: "+rev);
    }
}
