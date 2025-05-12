package ex_05_Java_Arrays;

public class Lab25_Array_operations {
    public static void main(String[] args) {

        int[] marks = {90, 91, 92, 93, 80, 67, 55};
        int maxop = maxmarks(marks);
        System.out.println(maxop);
    }

    static int maxmarks(int[] array) {
        int max = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        return max;
    }
}
