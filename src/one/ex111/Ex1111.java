package one.ex111;

import edu.princeton.cs.algs4.StdOut;

public class Ex1111 {
    public static void main(String[] args) {

    }
    public static void print2DArr(boolean[][] arr) {
        int xLen = arr.length;
        int yLen = arr[0].length;
        for (int i = 0; i < xLen; i++) {
            for (int j = 0; j < yLen; j++) {
                if (arr[i][j])
                    StdOut.print("*");
                else {
                    StdOut.println(" ");
                }
            }
            StdOut.println();
        }
    }
}
