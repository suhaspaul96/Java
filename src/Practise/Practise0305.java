package Practise;

public class Practise0305 {
    public static void main(String[] args) {

        int n1 = 0;
        int n2 = 1;

        System.out.print(n1+" "+n2);

        int sum = 0;
        int num = 5;

        for(int i = 2;i<=num;i++){

            sum = n1+n2;
            System.out.print(" "+sum);
            n1 = n2;
            n2 = sum;
        }

    }
}
