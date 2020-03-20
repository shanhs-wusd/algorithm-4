package cat10.cat11.ex111;

import edu.princeton.cs.algs4.StdOut;

public class Ex1114 {
    public static void main(String[] args) {
        int lg = lg(8);
        StdOut.println();
    }
    public static int lg(int N) {
        int cnt = -1;
        for (int i = 1; i <= N; i *= 2) {
            cnt++;
        }
        return cnt;
    }
}
