package Chapter.Three;

public class 二分查找 {
    /*
    Dichotomy search
    [left, right] interval
     */
    public static int function1(int[] arr, int target) {
        int leftIndex = 0;
        int rightIndex = arr.length - 1;
        int mid = (leftIndex + rightIndex) / 2;
        while (leftIndex <= rightIndex) {
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                rightIndex = mid;
            } else if (arr[mid] < target) {
                leftIndex = mid;
            }
            mid = (leftIndex + rightIndex) / 2;
        }
        return -1;
    }

    /*
    Dichotomy search
    [left, right) interval
     */
    public static int function2(int[] nums, int target) {
        int length = nums.length;
        int left = 0;
        int right = length;
        int mid = 0;
        while (left < right) {
            mid = (left + right) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        //System.out.println(function1(new int[]{1, 2, 3, 4, 5, 6}, 5));
        System.out.println(function2(new int[]{1, 2, 3, 4, 5, 6}, 6));
    }
}
