package ex_05_Java_Arrays;

import java.util.Scanner;

public class Lab36_Array_UserInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = sc.nextInt();

        int[] numbers = new int[size];


        for (int i = 0; i < size; i++) {
            System.out.println("Enter the mumbers: ");
            numbers[i] = sc.nextInt();
        }

        System.out.println("-------------------------------");

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }


    }
}
