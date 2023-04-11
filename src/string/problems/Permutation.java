package string.problems;


import java.util.Scanner;

public class Permutation {

    static void printDistinctString(String input, String result){

        if (input.length()==0){
            System.out.print(result+", ");
            return;
        }
        boolean alphabet[] = new boolean[26];
        for (int i = 0; i < input.length() ; i++) {
            char ch = input.charAt(i);

            String restValue = input.substring(0,i) + input.substring(i+1);

            if (alphabet[ch - 'a'] == false)
                printDistinctString(restValue, result + ch);
            alphabet[ch - 'a'] = true;
        }
    }
    public static void main(String[] args) {
        /*
         * Permutation of String "ABC" is "ABC" "BAC" "BCA" "ACB" "CAB" "CBA".
         * Write Java program to compute all Permutation of a String
         *
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String word = scan.nextLine();

        System.out.println("Permutations of " + word + ": ");

       printDistinctString(word,"");

    }
}
