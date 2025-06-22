package ATB10X_Java_Coding.Arrays;

import java.util.Scanner;

public class CharCount {
    public static void main(String[] args) {
         {
            // Step 1: Take input from user
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a word: ");
            String word = scanner.nextLine();

            // Step 2: Convert word to lowercase for case-insensitive comparison (optional)
            word = word.toLowerCase();

            // Step 3: Create an array of size 256 for ASCII characters
            int[] count = new int[256]; // ASCII size

            // Step 4: Loop through the word and count frequency
            for (int i = 0; i < word.length(); i++) {
                char ch = word.charAt(i);
                count[ch]++; // Increment count at the ASCII value index
            }

            // Step 5: Display character frequencies
            System.out.println("Character frequencies:");
            for (int i = 0; i < 256; i++) {
                if (count[i] > 0) {
                    System.out.println((char)i + ": " + count[i]);
                }
            }

            scanner.close();
    }
}}
