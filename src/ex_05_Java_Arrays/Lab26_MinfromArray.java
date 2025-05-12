package ex_05_Java_Arrays;

public class Lab26_MinfromArray {
    public static void main(String[] args) {

        int[] marks = {90, 56, 78, 43, 76};

        int minnum = min(marks);
        System.out.println(minnum);

    }

    static int min(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}
