import java.util.*;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class utility{
    public static void printMessage(String houseNumber, String streetName, String city){
        System.out.println("House Number: "+ houseNumber+ "Street Name: "+ streetName+ "city: "+city);
    }
}


public class Tester {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String inputString = in.nextLine();
        List<String> numbers = Arrays.stream(inputString.split(",")).collect(Collectors.toList());

        String houseNumber = numbers.get(0);
        String streetName =  numbers.get(1);
        String city = numbers.get(2);

        utility.printMessage(houseNumber, streetName, city);
    }
}
