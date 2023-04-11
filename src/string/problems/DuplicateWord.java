package string.problems;

import java.util.Arrays;
import java.util.HashMap;

public class DuplicateWord {

    public static void main(String[] args) {
        /*
         * Write a java program to find the duplicate words and their number of occurrences in the string.
         * Also Find the average length of the words.
         */

        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";
        st = st.replaceAll("\\p{Punct}", " ");

        String [] words = st.split(" ");
        System.out.println(Arrays.toString(words));

        HashMap <String,Integer> duplicate = new HashMap<>();
        int totalLength = 0;

        for (int i = 0; i < words.length ; i++) {
            if (duplicate.containsKey(words[i])) {
                duplicate.put(words[i], duplicate.get(words[i]) + 1);
            }else{
                duplicate.put(words[i],1);

            }
            totalLength += words[i].length();
        }
        double averageLength =(double) totalLength / words.length;
            System.out.println(duplicate);
        
        System.out.println("Average word length: " + averageLength);
    }

}
