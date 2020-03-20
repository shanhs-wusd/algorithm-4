package cat20.ex;

import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Ex1309 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        while (!StdIn.isEmpty()) {
            String s = StdIn.readString();
            for (String str : s.split("")) {
                if (str.equals(")") && !stack.peek().equals(")")) {
                    String pop = stack.pop();//2
                    String pop2 = stack.pop();//+
                    String pop3 = stack.pop();//1
                    String result = "(" + pop3 + pop2 + pop + str;
                    stack.push(result);
                } else stack.push(str);
            }
            StdOut.println(stack.pop());
        }
    }
}
