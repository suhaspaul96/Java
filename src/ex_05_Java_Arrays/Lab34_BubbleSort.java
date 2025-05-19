package ex_05_Java_Arrays;

public class Lab34_BubbleSort {
    public static void main(String[] args) {

        int[] arr = {12, 3, 2, 56, 78, 90, 234};

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    //swap elements
                    int temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j + 1] = temp;

                }
            }

        }
        System.out.println("sorted array");
        for (int n : arr) {
            System.out.println(n);
        }

    }
}
