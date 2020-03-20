package cat10;

import edu.princeton.cs.algs4.StdOut;

public class Others {
    /**
     * 最大公约数
     *
     * @param p
     * @param q
     */
    public static int gcd(int p, int q) {
        if (q == 0)
            return p;
        int r = p % q;
        return gcd(q, r);
    }

    public static void main(String[] args) {
        System.out.println(gcd(6, 4));
        StdOut.println("src/test");
    }
}
