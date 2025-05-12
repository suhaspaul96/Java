package ex_05_Java_Arrays;

import java.util.ArrayList;
import java.util.List;

public class Lab30_ArrayPractise04 {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        for (String name : names) {
            System.out.println(name);
        }

        List<Integer> num = new ArrayList<>();
        num.add(01);
        num.add(02);
        for(Integer nums: num){
            System.out.println(nums);
        }

    }
}
