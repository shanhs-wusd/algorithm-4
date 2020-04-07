package cat10.cat12;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Stack;

/**
 * @author wusd
 * @date 2020/3/22 18:26
 */
public class Ex10 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        while (!StdIn.isEmpty()) {
            String s = StdIn.readString();
            switch (s) {
                case "+":
                case "-":
                case "*":
                case "/":
                    stack.push(s);
                    break;
                case "(":
                    break;
                case ")":
                    StdOut.print(stack.pop() + " ");
                    break;
                default:
                    StdOut.print(s + " ");
            }
        }
    }
}
