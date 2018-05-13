package one.ex;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Locale;

public class E03 {
    public static void main(String[] args) {
        /*int[] ints = new int[3];
        int cnt = 0;
        while (!StdIn.isEmpty()) {
            ints[cnt] = StdIn.readInt();
            cnt++;
        }
        StdOut.println(equal(ints));
        StdOut.println("count:" + count());
        StdOut.println("BinaryString:" + toBinaryString(20));
        printRecursion();*/
//        printRecursionArr();
        while (!StdIn.isEmpty()) {
            lg(StdIn.readInt());
        }

    }

    public static boolean equal(int[] ints) {
        boolean flag = true;
        for (int i = 0; i < ints.length - 1; i++) {
            if (ints[i] != ints[i + 1]) {
                flag = false;
                break;
            }
        }
        return flag;
    }
    public static boolean range(double x, double y) {
        if (0 < x && x < 1 && 0 < y && y < 1) return true;
        return false;
    }
    public static int fibonacci(int f, int g) {
        for (int i = 0; i <= 15; i++) {
            f = f + g;
            g = f - g;
        }
        return f;
    }
    public static int count1() {
        int count = 0;
        for (int i = 1; i < 1000; i *= 2) {
            for (int j = 0; j < 1000; j++) {
                count++;
            }
        }
        return count;
    }

    public static int count() {
        int count = 0;
        for (int i = 1; i < 1000; i++) {
            for (int j = 0; j < i; j++) {
                count++;
            }
        }
        return count;
    }

    public static String toBinaryString(int N) {
        String s = "";
        for (int n = N; n > 0; n /= 2) {
            s = (n % 2) + s;
        }
        return s;
    }

    public static void printBooleanArr(boolean[][] boolArr) {
        for (int i = 0; i < boolArr.length; i++) {
            for (int j = 0; j < boolArr[0].length; j++) {
                if (boolArr[i][j]) {
                    StdOut.printf("行号:%2d,列号:%2d,%1s", i, j, "*");
                } else {
                    StdOut.printf("行号:%2d,列号:%2d,%1s", i, j, " ");
                }
                StdOut.println();
            }
        }
    }

    public static void printRecursion() {
        int[] a = new int[10];
        for (int i = 0; i < 10; i++) {
            a[i] = 9 - i;
        }
        for (int i = 0; i < 10; i++) {
            a[i] = a[a[i]];
        }
        for (int i = 0; i < 10; i++) {
            StdOut.println(i);
        }
    }

    public static void printRecursionArr() {
        int[][] arr0 = new int[3][2];
        for (int i = 0; i < arr0.length; i++) {
            for (int j = 0; j < arr0[0].length; j++) {
                arr0[i][j] = Integer.parseInt("" + i + j);
                StdOut.printf(Locale.CHINESE,"行号:%2d,列号:%2d:%1s  ", i, j, arr0[i][j]);
            }
        }
        StdOut.println();
        int[][] arr1 = new int[arr0[0].length][arr0.length];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[0].length; j++) {
                arr1[i][j] = arr0[j][i];
                StdOut.printf(Locale.CHINESE,"行号:%2d,列号:%2d:%1s  ", i, j, arr1[i][j]);
            }
        }
    }

    public static void lg(int N) {
        int result = 0;
        for (int i = 1; i < N; i *= 2) {
            result++;
        }
        result--;
        StdOut.println("result:" + result);
    }

}
