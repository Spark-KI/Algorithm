/*
 * This class is a complement to SortingOfNaturalNumbers which have sort algorithm.
 */

package Chapter.Three;

public class SortAlgorithm {
    // Insert sort
    public static int[] function1_1(int[] arr2) {
        for (int i = 1; i < arr2.length; i++) {
            for (int j = 0; j < i; j++) {
                if (arr2[i] < arr2[j]) {
                    int t = arr2[i];
                    arr2[i] = arr2[j];
                    arr2[j] = t;
                }
            }
        }
        return arr2;
    }

    // Bubble sort
    public static int[] function1_2(int[] arr2) {
        for (int i = 0; i < arr2.length; i++) {
            // add
            boolean swap = false;
            // user arr2.length-i-1
            // because after each selection of the largest value, you can do not need to sort
            for (int j = 0; j < arr2.length - i - 1; j++) {
                if (arr2[j] > arr2[j + 1]) {
                    int t = arr2[j];
                    arr2[j] = arr2[j + 1];
                    arr2[j + 1] = t;
                    swap = true;
                }
            }
            if (!swap) {
                break;
            }
        }
        return arr2;
    }

    // Merge sort
    public static int[] function1_3(int[] arr2) {
        //Recursive merge sort
        return function1_3_InternalMerge(arr2, 0, arr2.length - 1);

        //nonRecursive merge sort
        //return nonRecursive(arr2);
    }

    // Merge sort recursion
    public static int[] function1_3_InternalMerge(int[] arr2, int left, int right) {
        if (left < right) {
            int mid = left + ((right - left) >> 1);
            //left arr2
            function1_3_InternalMerge(arr2, left, mid);
            function1_3_InternalMerge(arr2, mid + 1, right);
            function1_3_SortArray(arr2, left, right);
        }
        return arr2;
    }

    //Merge non-recursive
    public static int[] nonRecursive(int[] arr2) {
        int len = 2;

        while (len <= arr2.length) {
            for (int i = 0; (i + len) < arr2.length; i += 2) {
                function1_3_SortArray(arr2, i, i + len - 1);
            }
            len = len * 2;
        }
        return arr2;
    }

    // Merge sort recursion, merge two arrays
    public static int[] function1_3_SortArray(int[] arr2, int left, int right) {
        /*
         *  The right and left variables
         * are the array intervals that need to be sorted, will not auto increment in this method;
         *  The rightIndex and leftIndex variables
         * represent the initial subscripts of two adjacent ordered intervals
         *
         */
        int leftIndex = left;
        int mid = left + ((right - left) >> 1);
        int rightIndex = mid + 1;
        int[] temp = new int[arr2.length];//temporary array

        // Array temp's temporary index
        // Each time the temporary array is stored starting from subscript 0
        int i = 0;
        while (leftIndex <= mid || rightIndex <= right) {
            if (rightIndex > right) {
                temp[i++] = arr2[leftIndex++];
            } else if (leftIndex > mid) {
                temp[i++] = arr2[rightIndex++];
            } else if (arr2[leftIndex] <= arr2[rightIndex]) {
                temp[i++] = arr2[leftIndex++];
            } else {
                temp[i++] = arr2[rightIndex++];
            }
        }
        // Store the value of the temporary array into the original array
        i = 0;
        while (left <= right) {
            arr2[left++] = temp[i++];
        }
        return arr2;
    }
}
