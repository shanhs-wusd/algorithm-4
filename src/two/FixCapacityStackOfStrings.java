package two;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class FixCapacityStackOfStrings {
    private String[] a;
    private int N;
    public FixCapacityStackOfStrings(int cap) {
        a = new String[cap];
    }

    public void push(String item) {
        a[N++] = item;
    }

    public String pop() {
        return a[--N];
    }
    public int size() {
        return N;
    }
    public boolean isEmpty() {
        return N == 0;
    }

    public static void main(String[] args) {
        FixCapacityStackOfStrings s;
        s = new FixCapacityStackOfStrings(100);
        while (!StdIn.isEmpty()) {
            String item = StdIn.readString();
            if (!item.equals("-"))
                s.push(item);
            else if (!s.isEmpty()) StdOut.print(s.pop() + " ");
            StdOut.println();
        }
        StdOut.println("(" + s.size() + " left on stack");
    }
}
