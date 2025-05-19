package ex_05_Java_Arrays;

public class Lab35_BubblesortPractise {
    public static void main(String[] args) {

        int[] num = {65, 34, 23, 98, 456, 87};

        for (int i = 0; i < num.length - 1; i++) {
            for (int j = 0; j < num.length - 1 - i; j++) {
                if (num[j] > num[j + 1]) {
                    //swap the elements
                    int temp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                }
            }

        }
        System.out.println("sorted array");
        for (int n : num) {
            System.out.println(n);
        }

    }
}
