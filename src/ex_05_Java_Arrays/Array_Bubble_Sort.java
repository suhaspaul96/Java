package ex_05_Java_Arrays;

public class Array_Bubble_Sort {
    public static void main(String[] args) {

        int [] numbers = {34,21, 25, 67, 45, 95, 100};

        int minimum = num(numbers);
        System.out.println(minimum);
    }

    static int num(int[] array){

        int min = array[0];
        for(int i = 0;i<array.length;i++){
            if(array[i]<min){
                min = array[i];
            }
        }


        return min;

    }
}
