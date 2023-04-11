package string.problems;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        /*
          If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
          Palindrome. So write java code to check if a given String is Palindrome or not.
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String to check if it's a palindrome: ");

        String str = sc.nextLine();
        String str1 = str.toLowerCase().replace(" ", "");

        String reverse = "";

            for (int i = str1.length() - 1; i >= 0 ; i--) {
                reverse += (str1.charAt(i));
            }
            boolean palindrome = true;
                for (int i = 0; i < str1.length(); i++) {
                    if (str1.charAt(i) != reverse.charAt(i)){
                        palindrome = false;
                    }
        }
              if (palindrome) {
            System.out.println(str1 + " is a palindrome string.");
            }   else {
            System.out.println(str1 + " is not a palindrome string.");
            }
        }
}