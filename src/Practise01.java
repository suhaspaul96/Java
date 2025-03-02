import java.util.Scanner;

public class Practise01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String S = sc.next();

        String rev = "";

        for(int i=S.length()-1;i>=0;i--){

            rev = rev+S.charAt(i);
        }
        System.out.println("Reverse as string: "+rev);

    }
}
