package cat20;

import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Evaluate {
    public static void main(String[] args) {
        Stack<String> ops = new Stack<>();
        Stack<Double> vals = new Stack<>();
        while (!StdIn.isEmpty()) {
            String str = StdIn.readString();
            String[] split = str.split("");
            for (String s : split) {
                if (s.equals("(")) ;
                else if (s.equals("+")) ops.push(s);
                else if (s.equals("-")) ops.push(s);
                else if (s.equals("*")) ops.push(s);
                else if (s.equals("/")) ops.push(s);
                else if (s.equals(")")) {
                    double b = vals.pop();
                    double a = vals.pop();
                    String op = ops.pop();
                    if (op.equals("+")) vals.push(a + b);
                    else if (op.equals("-")) vals.push(a - b);
                    else if (op.equals("*")) vals.push(a * b);
                    else if (op.equals("/")) vals.push(a / b);
                }
                else vals.push(Double.valueOf(s));
            }
        }
        StdOut.println(vals.pop());
    }
}
