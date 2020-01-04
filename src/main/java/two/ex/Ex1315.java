package two.ex;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;
import two.Queue;

public class Ex1315 {
    public static void main(String[] args) {
        int k = Integer.valueOf(args[0]);
        Queue<Integer> queue = new Queue<>();
        for (int i = 0; i < k + 10; i++) {
            queue.enqueue(i);
        }

        Integer ks = -1;
        for (int i = 0; i < queue.size() - k; i++) {
            ks = queue.dequeue();
        }
        StdOut.println(ks);
    }
}
