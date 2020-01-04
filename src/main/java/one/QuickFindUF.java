package one;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * QuickFindUF
 *
 * @author wusd
 */
public class QuickFindUF implements UF {
    private int[] id;

    public QuickFindUF(int N) {
        id = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
        }
    }

    @Override
    public boolean connected(int p, int q) {
        return id[p] == id[q];
    }

    @Override
    public void union(int p, int q) {
        int pId = id[p];
        int qId = id[q];
        if (pId == qId) return;
        for (int i = 0; i < id.length; i++) {
            if (id[i] == qId)
                id[i] = pId;
        }
    }

    public static void main(String[] args) {
        int N = StdIn.readInt();
        QuickFindUF uf = new QuickFindUF(N);
        while (!StdIn.isEmpty()) {
            int p = StdIn.readInt();
            int q = StdIn.readInt();
            if (uf.connected(p, q)) {
                continue;
            }
            uf.union(p, q);
            StdOut.println(p + " " + q);
        }
    }
}
