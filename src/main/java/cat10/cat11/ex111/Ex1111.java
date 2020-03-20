package cat10.cat11.ex111;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class Ex1111 {
    public static void main(String[] args) {
        int xLen = 10;
        int yLen = 9;
        boolean[][] arr = new boolean[10][9];
        for (int i = 0; i < xLen; i++) {
            for (int j = 0; j < yLen; j++) {
                int a = StdRandom.uniform(0, 2);
                if (a == 0) arr[i][j] = false;
                else arr[i][j] = true;
            }
        }
        print2DArr(arr);
    }

    public static void print2DArr(boolean[][] arr) {
        int xLen = arr.length;
        int yLen = arr[0].length;
        for (int i = 0; i < xLen; i++) {
            for (int j = 0; j < yLen; j++) {
                if (arr[i][j])
                    StdOut.print("*");
                else {
                    StdOut.print(".");
                }
                StdOut.print(i + "" + j);
            }
            StdOut.println();
        }
    }
}
