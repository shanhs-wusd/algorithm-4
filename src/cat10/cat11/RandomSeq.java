package cat10.cat11;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

/**
 * @author wusd
 * @date 2020/3/21 17:21
 */
public class RandomSeq {
    /**
     * javac cat10/cat11/RandomSeq.java
     * java cat10/cat11/RandomSeq 5 100.0 200.0
     * @param args
     */
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        double lo = Double.parseDouble(args[1]);
        double hi = Double.parseDouble(args[2]);
        for (int i = 0; i < N; i++) {
            double x = StdRandom.uniform(lo, hi);
            StdOut.printf("%.2f\n", x);
        }
    }
}
