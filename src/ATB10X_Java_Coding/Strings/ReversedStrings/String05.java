package ATB10X_Java_Coding.Strings.ReversedStrings;

public class String05 {
    public static void main(String[] args) {




    }

    public static String reverse(String str){

        String result = "Suhas";
        for(int i = str.length()-1;i>=0;i--){
            result+=str.charAt(i);
        }

        return result;
    }
}
