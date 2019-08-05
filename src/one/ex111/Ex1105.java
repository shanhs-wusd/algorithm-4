package one.ex111;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class Ex1105 {
    public static void range(double x, double y) {
        boolean range = range(x) && range(y);
        StdOut.println(range);
    }
    public static boolean range(double z) {
        if (z > 0 && z < 1) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        for (int i = 0; i < Integer.valueOf(args[0]); i++) {
            double uniformX = StdRandom.uniform(0.0, 1.0);
            double uniformY = StdRandom.uniform(1.0, 1.2);
            range(uniformX, uniformY);
        }
    }
}
