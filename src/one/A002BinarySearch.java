package one;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

public class A002BinarySearch {
    public static int rank(int key, int[] a) {
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi -lo) / 2;
            if (key < a[mid]) hi = mid - 1;
            else if (key > a[mid]) lo = mid + 1;
            else return mid;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] whitelist = In.readInts(args[0]);

        Arrays.sort(whitelist);

        while (!StdIn.isEmpty()) {
            int key = StdIn.readInt();
            if (rank(key, whitelist) == -1) {
                StdOut.println(key);

            }
        }
    }

    public void A113() {
//        int i;
//        double c;

//        a = b + 3;
//        discriminant = b * b - 4.0 * c;

    }

    public static double sqrt(double c) {
        if (c < 0) return Double.NaN;
        double err = 1e -15;
        double t = c;
        while (Math.abs(t - c/t) > err * t) {
            t = (c/t + t) / 2.0;
        }
        return t;
    }

    /**
     * 计算一个整数的绝对值
     * @param x
     * @return
     */
    public static int abs(int x) {
        if (x < 0) return -x;
        else return x;
    }

    /**
     * 计算一个浮点数的绝对值
     * @param x
     * @return
     */
    public static double abs(double x) {
        if (x < 0.0) return -x;
        else return x;
    }

    /**
     * 判断一个数是否是素数
     * @param N
     * @return
     */
    public static boolean isPrime(int N) {
        if (N < 2) return false;
        for (int i = 2; i * i <= N; i++) {
            if (N % i == 0) return false;
        }
        return true;
    }

    /**
     * 计算平方根（牛顿迭代法）
     * @param c
     * @return
     */
    public static double sqrt(double c) {
        if (c < 0) return Double.NaN;
        double err = 1e -15;
        double t = c;
        while (Math.abs(t - c/t) > err * t) {
            t = (c/t + t) / 2.0;
        }
        return t;
    }

    /**
     * 计算直角三角形的斜边
     * @param a
     * @param b
     * @return
     */
    public static double hypotenuse(double a, double b) {
        return Math.sqrt(a*a + b*b);
    }

    /**
     * 计算调和级数
     * @param N
     * @return
     */
    public static double H(int N) {
        double sum = 0.0;
        for (int i = 1; i < N; i++) {
            sum += 1.0/i;
        }
        return sum;
    }
}














