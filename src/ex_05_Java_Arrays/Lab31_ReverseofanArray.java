package ex_05_Java_Arrays;

public class Lab31_ReverseofanArray {
    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,5};
        for(int i=numbers.length-1;i>=0;i--){
            System.out.print(numbers[i]);
        }
    }
}
