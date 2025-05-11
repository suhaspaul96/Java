package ex_02_Java_Arrays;

public class Lab18 {
    public static void main(String[] args) {

        //declare an array
        //add values in array
        //fnd size of an array
        //read a single value from an array
        //read multiple values from an array

        //1st Approach declarimg an array

        int a[]  = new int[5];

        a[0] = 100;
        a[1] = 200;
        a[2] = 300;
        a[3]= 400;
        a[4] = 500;

        //2nd Approach

        int b[] = {100,200,300,400,500};

        //find legth of an array

        System.out.println("Length of an array is: "+a.length);

        System.out.println(a[4]);

    }
}
