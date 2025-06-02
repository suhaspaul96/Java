package ATB10X_Java_Coding.Strings.ReversedStrings;

public class String04 {
    public static void main(String[] args) {

        String input = "Avanti Shitole";

        String[] names = input.split(" ");

        String reversedfirstname = new StringBuilder(names[0]).reverse().toString();

        String result = reversedfirstname+ " "+names[1];

        System.out.println(result);

    }
}
