package one.ex111;

import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

//二维数组转置
public class Ex1113 {
    public static void main(String[] args) {
        int[][] arr = new int[10][9];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = 10 * i + j;
            }
        }
        int[][] reverse = reverse(arr);
        StdOut.println();
    }

    public static int[][] reverse(int[][] arr) {
        boolean equalsLength = equalsLength(arr, arr.length - 1);
        if (!equalsLength) {
            throw new RuntimeException("长度不一无法倒置");
        }
        int yLen = arr.length;
        int xLen = arr[0].length;
        int[][] resulArr = new int[xLen][yLen];
        for (int x = 0; x < xLen; x++)
            for (int y = 0; y < yLen; y++)
                resulArr[x][y] = arr[y][x];
        StdOut.println(Arrays.toString(resulArr));
        return resulArr;
    }

    public static boolean equalsLength(int[][] arr, int index) {
        int length = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) length = arr[i].length;
            else if (length != arr[i].length) return false;
        }
        return true;
    }
}