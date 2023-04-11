package algorithm;

import java.util.Arrays;

public class Sort {

    long executionTime = 0;
    /*
	 * Please implement all the sorting algorithm. Feel free to add helper methods.
	 * Store all the sorted data into one of the databases.
	 */

    public int[] selectionSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;

        for(int j=0; j<array.length-1; j++){
            int min = j;
            for(int i=j+1; i<array.length; i++) {
                if (array[i] < array[min])
                    min = i;
            }
            int temp = array[min];
            array[min] = array[j];
            array[j] = temp;
        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }
    public int[] insertionSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        //implement here
        int inSertSort = list.length;
        for (int i = 1; i < inSertSort; i++) {
            int key = list[ i ];
            int j = i - 1;
            while (j >= 0 && list[ j ] > key) {
                list[ j + 1 ] = list[ j ];
                j--;
            }
            list[ j + 1 ] = key;
        }
    final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }
    public int[] bubbleSort(int [] array){
        int [] list = array;
        //implement here
        int bubbles = list.length;
        for (int i = 0; i < bubbles; i++) {
            for (int j = 1; j < bubbles - i - 1; j++) {
                if (array[ j ] > array[ j + 1 ]) {
                    int temp = array[ j ];
                    array[ j ] = array[ j + 1 ];
                    array[ j + 1 ] = temp;
                }
            }
        }
        return list;
    }
    public int [] mergeSort(int [] array){
        int [] list = array;
        //implement here
        if (list.length <= 1){
            return array;
        }
        int middle = array.length / 2;
        int [] left = Arrays.copyOfRange(array, 0, middle);
        int [] right = Arrays.copyOfRange(array, middle, array.length);

        left = mergeSort(left);
        right = mergeSort(right);





        return list;
    }


    public int [] quickSort(int [] array){
        int [] list = array;
        //implement here



        return list;
    }

    public int [] heapSort(int [] array){
        int [] list = array;
        //implement here



        return list;
    }


    public int [] bucketSort(int [] array){
        int [] list = array;
        //implement here



        return list;
    }

    public int [] shellSort(int [] array){
        int [] list = array;
        //implement here



        return list;
    }

    public static void printSortedArray(int [] array){
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }
}
