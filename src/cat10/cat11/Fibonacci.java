package cat10.cat11;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * @author wusd
 * @date 2020/3/20 16:48
 */
public class Fibonacci {
    public static void main(String[] args) {
        int i = StdIn.readInt();
//        StdOut.println(lowF(i));
        StdOut.println(f(i));
    }

    public static long lowF(int N) {
        if (N == 0) return 0;
        if (N == 1) return 1;
        return lowF(N - 1) + lowF(N - 2);
    }

    public static long f(int N) {
        long[] a = new long[N + 1];
        for (int i = 0; i < a.length; i++) {
            if (i <= 1) a[i] = i;
            else a[i] = a[i - 1] + a[i - 2];
        }
        return a[N];
    }
}
