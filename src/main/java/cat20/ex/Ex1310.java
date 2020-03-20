package cat20.ex;

import cat20.Stack;

public class Ex1310 {
    public static void main(String[] args) {
        String str = "2*3/(2-1)+3*(4-1)";
        infixToPostfix(str.split(""));
    }

    public static void infixToPostfix(String[] strs) {
        Stack<String> stack = new Stack<>();
        Stack<String> temp = new Stack<>();
        for (String str : strs) {
            if (str.equals("(")) {
                temp.push(str);
            } else if (str.equals(")")) {
                while (true) {
                    String pop = temp.pop();
                    //运算出来
                    if (pop.equals("(")) break;
                }
            }
        }
    }
}
