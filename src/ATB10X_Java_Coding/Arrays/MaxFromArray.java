package ATB10X_Java_Coding.Arrays;

public class MaxFromArray {
    public static void main(String[] args) {

        int[] num = {1, 3, 5, 6};
        int maximum = max(num);
        System.out.println(maximum);

    }

    static int max(int[] array) {

        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}

