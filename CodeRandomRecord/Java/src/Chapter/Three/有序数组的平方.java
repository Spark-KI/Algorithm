package Chapter.Three;

public class 有序数组的平方 {
    /*
     Brute force (Sorting Algorithm)
     */
    public static int[] function1(int[] arr1) {
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = arr1[i] * arr1[i];
        }

        // choose the algorithm about sort
        return SortAlgorithm.function1_1(arr1);
    }

    // double pointer method
    public static int[] function2(int[] arr1) {
        int leftIndex = 0;
        int rightIndex = arr1.length - 1;
        //
        int[] temp = new int[arr1.length];

        //
        int i = 0;
        for (i = 0; i < arr1.length; i++){
            if (Math.abs(arr1[leftIndex]) > Math.abs(arr1[rightIndex])){
                temp[i] = arr1[leftIndex]*arr1[leftIndex];
                leftIndex++;
            }else{
                temp[i] = arr1[rightIndex]*arr1[rightIndex];
                rightIndex--;
            }
        }

        // Fill in the original array in reverse order
        i-=1;
        while(i!=-1){
            arr1[arr1.length-i-1] = temp[i--];
        }
        return arr1;
    }

    public static void main(String[] args) {
        int[] arr1 = new int[]{-3, -2, -1, 0, 1, 2, 3};
        int[] arr2 = new int[]{4, 3, 2, 1};
        for (int val : function2(arr1)) {
            System.out.print(val + " ");
        }
    }
}
