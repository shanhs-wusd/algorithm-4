package one.ex;

import edu.princeton.cs.algs4.StdOut;

public class E01 {
    public static int a01() {
        int a = (0 + 15) / 2;
        StdOut.println(a);
        return a;
    }
    public static double b01() {
        double ch = 2.0e-6;
        StdOut.println("ch:" + ch);
        double ch1 = 2.0e-6 * 100000000.1;
        StdOut.println("ch1:" + ch1);
        return ch1;
    }
    public static void main(String[] args) {
        b01();
        String s = 1 + 2 + "3";
        StdOut.println("s:" + s);
    }
}
