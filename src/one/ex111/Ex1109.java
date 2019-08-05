package one.ex111;

import edu.princeton.cs.algs4.StdOut;

public class Ex1109 {
    public static void main(String[] args) {
        toBinaryString(Integer.valueOf(args[0]));

        String binaryString = Integer.toBinaryString(Integer.valueOf(args[0]));
        StdOut.println(binaryString);
    }
    public static String toBinaryString(int N) {
        String binaryStr = "";
        for (int i = N; i > 0; i = i / 2)
            binaryStr = i % 2 + binaryStr;
        StdOut.println(binaryStr);
        return binaryStr;
    }
}
