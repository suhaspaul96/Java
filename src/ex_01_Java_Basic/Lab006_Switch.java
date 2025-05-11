package ex_01_Java_Basic;

import java.util.Scanner;

public class Lab006_Switch {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a browser: ");
        String browser = sc.next();

        switch (browser){
            case "chrome":
                System.out.println("This is chrome browser");
                break;
            case "edge":
                System.out.println("This is edge browser");
                break;
            case "safari":
                System.out.println("This is safari browser");
                break;
            case "Firefox":
                System.out.println("This is Firefox browser");
                break;
            default:
                System.out.println("Not a known browser");
                break;

            }
        }

    }

