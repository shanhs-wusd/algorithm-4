package one;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class A0223String {
    /**
     * 判断字符串是否是一条回文
     * @param s
     * @return
     */
    public static boolean isPalindrome(String s) {
        int N = s.length();
        for (int i = 0; i < N/2; i++) {
            if (s.charAt(i) != s.charAt(N - 1 - N))
                return false;
        }
        return true;
    }


    public static void main(String[] args) {
        /**
         * 从一个命令行参数中提取文件名和扩展名
         */
        String s = args[0];
        int dot = s.indexOf(".");
        String base = s.substring(0, dot);
        String extension = s.substring(dot + 1, s.length());
        /**
         * 打印出标准输入中所有含有通过命令行指定的字符串的行
         */
        String query = args[0];
        while (!StdIn.isEmpty()) {
            String s1 = StdIn.readLine();
            if (s1.contains(query)) {
                StdOut.println(s);
            }
        }
        /**
         * 以空白字符为分隔符从StdIn中创建一个字符串数组
         */
        String input = StdIn.readAll();
        String[] words = input.split("\\s+");
    }

    /**
     * 检查一个字符串数组中的元素是否已按照字母表顺序排列
     * @param a
     * @return
     */
    public boolean isSorted(String[] a) {
        for (int i = 1; i < a.length; i++) {
            if (a[i - 1].compareTo(a[i]) > 0) {
                return false;
            }
        }
        return true;
    }
}
