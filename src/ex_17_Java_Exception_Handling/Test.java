package ex_17_Java_Exception_Handling;

public class Test {
    public static void main(String[] args) {

        try {
            int[] arr = new int[5];
            arr[10] = 100; // This will throw an ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is out of bounds: " + e.getMessage());
        } finally {
            System.out.println("This block always executes.");
        }

        System.out.println("Program continues after exception handling.");
    }
}
