package ex_05_Java_Arrays;

import java.util.Arrays;

public class Lab33_SortArray {
    public static void main(String[] args) {

        int num[] = {12, 34, 56, 74, 98, 3};

        Arrays.sort(num);
        System.out.println(num[num.length - 2]);
        System.out.println("-----------------------");

        for(int n:num){
            System.out.println(n);
        }
//        for (int i = 0; i < num.length; i++) {
//            System.out.println(num[i]);
//        }

    }
}
