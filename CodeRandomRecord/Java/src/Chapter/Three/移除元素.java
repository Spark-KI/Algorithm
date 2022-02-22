package Chapter.Three;

public class 移除元素 {
    /*
    暴力解法
     */
    static int function1(int[] a, int val) {
        int len = a.length;
        for (int i = 0; i < len; i++) {
            if (a[i] == val){
                for (int j = i; j<len-1; j++){
                    a[j] = a[j+1];
                }
                len--;
            }
        }
        return len;
    }

    /*
    双指针法
     */
    static int function2(int[] a, int val){
        int shortIndex = 0;
        for (int fastIndex = 0; fastIndex<a.length; fastIndex++){
            if (a[fastIndex]!=val){
                a[shortIndex] = a[fastIndex];
                shortIndex++;
            }
        }
        return shortIndex;
    }


    public static void main(String[] args) {
        int[] a = new int[]{0,1,0,2,0,3,0};
        int val = 0;
        System.out.println(function2(a, val));
    }
}
