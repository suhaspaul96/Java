package ex_01_Java_Basic;

public class Lab015 {
    public static void main(String[] args) {
        for (int i = 1; i < 50; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println(i);
        }
    }
}