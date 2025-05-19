package ex_05_Java_Arrays;

import java.util.Scanner;

public class Lab37_Array_UserInputPractise {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a size of an array: ");
        int size = sc.nextInt();

        int[] number = new int[size];

        for (int i = 0; i < size; i++) {

            System.out.println(size);
            number[i] = sc.nextInt();

        }
        System.out.println("---------------------------");

        for (int i = 0; i < number.length; i++) {

            System.out.println(number[i]);
        }


    }
}
