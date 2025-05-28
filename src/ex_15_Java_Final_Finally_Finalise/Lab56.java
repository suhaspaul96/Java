package ex_15_Java_Final_Finally_Finalise;

public class Lab56 {
    public static void main(String[] args) {

        try {
            int data = 10 / 0;
            System.out.println(data);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught");}
//        } finally {
//            System.out.println("This will always execute");
//        }
    }
}
