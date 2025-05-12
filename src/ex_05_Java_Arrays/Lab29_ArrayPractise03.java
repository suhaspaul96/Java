package ex_05_Java_Arrays;

public class Lab29_ArrayPractise03 {
    public static void main(String[] args) {

        int[] rollnumber = {1, 8, 7, 4, 2,};
        int minimum = minroll(rollnumber);
        System.out.println(minimum);
    }

    static int minroll(int[] array){

        int min = array[0];
        for(int i=0;i<array.length;i++){

            if(array[i]<min){
                min = array[i];
            }
        }
        return min;
    }
}
