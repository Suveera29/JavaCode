package july11.Loop;

import java.util.Locale;
import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input an alphabet:");
        String name = sc.next().toLowerCase();

        boolean uppercase = name.charAt(0) >= 65 && name.charAt(0) <= 90;
        boolean lowercase = name.charAt(0) >= 97 && name.charAt(0) <= 122;
        boolean vowels = name.equals("a") || name.equals("e") || name.equals("i")
                || name.equals("o") || name.equals("u");

        if (name.length() > 1)
        {
            System.out.println("Error. Not a single character.");
        }
        else if (!(uppercase || lowercase))
        {
            System.out.println("Error. Not a letter. Enter uppercase or lowercase letter.");
        }
        else if (vowels)
        {
            System.out.println("Input letter is Vowel");
        }
        else
        {
            System.out.println("Input letter is Consonant");
        }
    }

        }
