package ATB10X_Java_Coding.Strings.ReversedStrings;

public class String02 {
    public static void main(String[] args) {

        String input = "Suhas Poul";

        String [] names = input.split(" ");

        String reversedFirstName = new StringBuilder(names[0]).reverse().toString();

        String result = reversedFirstName +" "+names[1];

        System.out.println(result);


    }
}
