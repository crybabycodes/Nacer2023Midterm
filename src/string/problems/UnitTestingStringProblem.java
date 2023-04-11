package string.problems;


import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class UnitTestingStringProblem {
    public static void main(String[] args) {
        //Apply Unit Test into all the methods in this package.
        testIsAnagram_valid();
    }
    @Test
    public static void testIsAnagram_valid() {
        assertTrue(Anagram.isAnagram("rat", "tar"));
    }
    @Test
    public static void testLargestWord(){

    }


    }

