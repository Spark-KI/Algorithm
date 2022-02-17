package Chapter.Two.One_Three;

import java.util.*;

public class 求x的n次方 {

    public static int count = 0;

    public static int function1(int x, int n) {
        int sum = 1;
        for (int i = 0; i < n; i++) {
            sum *= x;
        }
        return sum;
    }

    public static int function2(int x, int n){
        if (n==0){
            return 1;
        }
        return x*function2(x,n-1);
    }

    public static int function3(int x, int n){
        if (n==0){
            return 1;
        }
        if (n%2==0){
            return function3(x, n/2)*function3(x, n/2);
        }
        return function3(x, n/2)*function3(x, n/2)*x;
    }

    public static int function4(int x, int n){
        count+=1;
        if (n == 0){
            return 1;
        }
        int t = function4(x, n/2);
        if (n%2==0){
            return t*t;
        }
        return t*t*x;
    }

    public static void main(String[] args) {
        System.out.println(function4(10, 7));
        System.out.println(count);
    }
}