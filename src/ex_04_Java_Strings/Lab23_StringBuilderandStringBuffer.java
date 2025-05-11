package ex_04_Java_Strings;

public class Lab23_StringBuilderandStringBuffer {
    public static void main(String[] args) {

        /*StringBuilder and string Buffer classes provides mutable sequences of characters

        if we declare string suhas and do modification on it new string will not be crated it means they are mutable
        whenever we need dynamic string in nature we opt for String Builder or string Buffer
        the main difference betwee string builder and string buffer are string builder is not thread safe but string buffer is
        thread safe(slow).



         */

        StringBuffer str = new StringBuffer("Suhas");
        str.append(" Poul");
        System.out.println(str);
        System.out.println(str.reverse());

        StringBuilder str1 = new StringBuilder("Avanti");
        str1.append(" Shitole");
        System.out.println(str1);



    }
}
