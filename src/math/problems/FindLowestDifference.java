package math.problems;


import java.util.Arrays;

public class FindLowestDifference {
    public static void main(String[] args) {
        /*
         Implement in java.
         Read this below two array. Find the lowest difference between the two array cell.
         The lowest difference between cells is 1
        */
        int[] array1 = {30, 12, 5, 9, 2, 20, 33, 1};
        int[] array2 = {18, 25, 41, 47, 17, 36, 14, 19};

        int i = array1.length;
        int j = array2.length;

        System.out.println("The lowest difference between two array cell is: " + minDiff(array1, array2, i, j));
    }
        static int minDiff (int [] array1, int [] array2,int i, int j) {
            Arrays.sort(array1);
            Arrays.sort(array2);

            int diff = 0;
            int diff2 = 0;

            int minDiff = Integer.MAX_VALUE;

            while (diff < i && diff2 < j) {

                if (Math.abs(array1[diff] - array2[diff2]) < minDiff)
                    minDiff = Math.abs(array1[diff] - array2[diff2]);

                if (array1[diff] < array2[diff2]) {
                    diff++;
                } else {
                    diff2++;
                }

            }
            return minDiff;
        }
}


