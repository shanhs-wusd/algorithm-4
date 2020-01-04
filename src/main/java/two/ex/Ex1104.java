package two.ex;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import two.Stack;

public class Ex1104 {
    public static void main(String[] args) {
        Stack<String> parentheses = new Stack<>();
        while (!StdIn.isEmpty()) {
            String op = StdIn.readString();
            if ("{([])}".contains(op)) {
                if (!parentheses.isEmpty()) {
                    String previousOp = parentheses.pop();
                    boolean parenth = parenth(op, previousOp);
                    if (!parenth) {
                        parentheses.push(previousOp);
                        parentheses.push(op);
                    }
                } else {
                    parentheses.push(op);
                }
            }
        }
        StdOut.println(parentheses.isEmpty());
    }

    public static boolean parenth(String op, String previousOp) {
        if (previousOp.equals("(") && op.equals(")")) return true;
        else if (previousOp.equals("[") && op.equals("]")) return true;
        else if (previousOp.equals("{") && op.equals("}")) return true;
        return false;
    }
}
