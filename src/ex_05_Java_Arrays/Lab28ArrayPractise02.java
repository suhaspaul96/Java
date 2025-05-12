package ex_05_Java_Arrays;

public class Lab28ArrayPractise02 {
    public static void main(String[] args) {

        int [] marks = {12, 45, 67, 78, 90};
        int maximum = maximummarks(marks);
        System.out.println(maximum);
    }

    static int maximummarks(int array[]){

        int max = array[0];
        for(int i=0;i<array.length;i++){

            if(array[i]>max){
                max = array[i];
            }
        }
        return max;
    }
}
