package Chapter.Two.Two_Four;

public class fibonacci {
    /*
    Function1 recursively calculates the Fibonacci sequence from the end (f(n), f(n-1), ..., 2, 1, 1)
    Time complexity: O(2^n)
    Space complexity: O(n)
     */
    public static int function1(int n) {
        if (n < 3) {
            return 1;
        }
        return function1(n - 1) + function1(n - 2);
    }

    /*
   Function2 recursively calculate the Fibonacci sequence (1, 1, 2, 3, ...) from scratch
    and use first and second to save the calculation results.
   Time complexity: O(n)
   Space complexity: O(n)
    */
    public static int function2(int n) {
        return function2_1(n, 1, 1);
    }

    public static int function2_1(int n, int first, int second) {
        if (n < 3) {
            return 1;
        } else if (n == 3) {
            return first + second;
        }
        return function2_1(n - 1, second, first + second);
    }

    /*
   Function3 compute the Fibonacci sequence (1, 1, 2, 3, ...) non-recursively from scratch
   Time complexity: O(n)
   Space complexity: O(1)
    */
    public static int function3(int n){
        int first = 1;
        int second = 1;
        if (n==1||n==2){
            return first;
        }

        int result = 0;
        for (int i=2;i<n;i++){
            result = first + second;
            first = second;
            second = result;
        }
        return result;
    }

    public static void main(String[] args) {
        long startTime = System.nanoTime();
        System.out.println("result:" + function3(40));
        long endTime = System.nanoTime();
        System.out.println("startTime:" + startTime + "\tendTime:" + endTime +
                "\ntime:" + (endTime - startTime));
    }
}
