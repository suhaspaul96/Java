package ex_05_Java_Arrays;

import java.util.Arrays;

public class Lab024 {
    public static void main(String[] args) {
        /*
        There are two ways we can create the arrays
        */

        //First way
        int[] marks = {34, 22, 17, 90, 91,92};  //arrays creation with predefined elements

        System.out.println(marks.length);

        Arrays.sort(marks);

        for(int mark: marks){       //for each loop only works with arrays and collection framework
            System.out.println(mark+" ");
        }


    // here the length is not a method of function but its an array prpoeprty
        //in case of string we called it as the methods or functions
        /*eg String name = "Suhas";

        name.length();
*/
//second way of declaring an array

        //int[] marks2 = new int[10]; //Fixed size array, once declared the size , here 10 is the size.




    }
}
