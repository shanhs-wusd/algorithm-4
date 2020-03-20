package cat10.cat11.ex111;

import edu.princeton.cs.algs4.StdOut;

/**
 * 从命令行得到三个整数参数.如果都相等打印equal,否则打印not equal
 */
public class Ex1103 {
    public static void main(String[] args) {
        if (args.length != 3) throw new RuntimeException("必须输入三个整数");
        int[] ints = new int[args.length];
        for (int i = 0; i < ints.length; i++)
            ints[i] = Integer.valueOf(args[i]);
        boolean flag = (ints[0] == ints[1]) && (ints[1] == ints[2]);
        if (flag) StdOut.print("equal");
        else StdOut.print("not equal");
    }
}
