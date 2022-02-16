package Chapter.Two.Two_Three;

public class 测试计算机运行速度 {

    public static void functionO1() {
        int k = 0;
        k = 1;
    }

    public static void functionOlogn(long n) {
        int k = 0;
        for (long i = 1; i <= n; i *= 2) {
            k++;
        }
    }

    public static void functionOn(long n) {
        int k = 0;
        for (long i = 0; i < n; i++) {
            k++;
        }
    }

    public static void functionOnlogn(long n) {
        int k = 0;
        for (long i = 0; i < n; i++) {
            for (long j = 1; j <= n; j *= 2) {
                k++;
            }
        }
    }

    public static void functionOn2(long n) {
        int k = 0;
        for (long i = 0; i < n; i++) {
            for (long j = 0; j < n; j++) {
                k++;
            }
        }
    }

    public static void functionOn3(long n) {
        int k = 0;
        for (long i = 0; i < n; i++) {
            for (long j = 0; j < n; j++) {
                for (long l = 0; l < n; l++) {
                    k++;
                }
            }
        }
    }

    public static void main(String[] args) {
        /*
        nanoTime()该方法所基于的时间是随机的，但在同一个JVM中，不同的地方使用的原点时间是一样的
         */
        long startTime = System.nanoTime();
        long n = 1000L;
        functionOn3(n);
        long endTime = System.nanoTime();
        System.out.println("StartTime:" + startTime + " EndTime:" + endTime);
        System.out.println("time: " + (endTime - startTime) + "nm");
    }

}
