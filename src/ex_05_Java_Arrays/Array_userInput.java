package ex_05_Java_Arrays;

import java.util.Scanner;

public class Array_userInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a size: ");
        int size = sc.nextInt();

        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }
        System.out.println("---------------");

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        sc.close();
    }
}
