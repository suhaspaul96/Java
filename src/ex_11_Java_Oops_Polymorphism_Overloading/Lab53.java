package ex_11_Java_Oops_Polymorphism_Overloading;

public class Lab53 {
    public static void main(String[] args) {

        MathOperation m1 = new MathOperation();
        int r = m1.add(1,2,3);
        System.out.println("add of three arguments:"+r);

        MathOperation m2= new MathOperation();
        int r2 = m2.add(5,6);
        System.out.println("add of two arguments:"+r2);

    }
}
