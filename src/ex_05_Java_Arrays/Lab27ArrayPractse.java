package ex_05_Java_Arrays;

public class Lab27ArrayPractse {
    public static void main(String[] args) {

        int[] marks = {10, 32, 7, 45, 67};
        int minimum = minmarks(marks);
        System.out.println(minimum);

    }

    static int minmarks(int array[]) {

        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}
