package ATB10X_Java_Coding.Strings.ReversedStrings;

public class String03 {
    public static void main(String[] args) {

        String input = "Suhas Poul";

        String [] names = input.split(" ");

        String reversedlastname = new StringBuilder(names[1]).reverse().toString();

        String result = names[0]+" "+reversedlastname;

        System.out.println(result);

    }
}
