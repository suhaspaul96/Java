package ex_01_Java_Basic;

public class Lab36_BubbleSortPractise01 {
    public static void main(String[] args) {

        int[] num = {1, 53, 76, 54, 90};

        for(int i=0;i<num.length-1;i++){
            for(int j=0;j<num.length-1-i;j++){
                if(num[j]>num[j+1]){
                    int temp = num[j];
                    num[j] = num[j+1];
                    num[j+1] = temp;

                }
            }
        }
        System.out.println("sorted array");
        for(int n:num){
            System.out.println(n);
        }

    }
}
