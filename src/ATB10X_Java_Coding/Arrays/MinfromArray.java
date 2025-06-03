package ATB10X_Java_Coding.Arrays;

public class MinfromArray {
    public static void main(String[] args) {

        int[] num = {34, 56, 78, 12, 99};

        int minimum = mini(num);
        System.out.println(minimum);

    }

    static int mini(int[] array) {

        int min = array[0];

        for (int i = 0; i < array.length; i++) {

            if (array[i] < min) {

                min = array[i];

            }

        }

        return min;
    }
}
