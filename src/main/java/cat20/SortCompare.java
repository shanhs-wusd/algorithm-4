package cat20;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.Stopwatch;

public class SortCompare {
    //根据名称选择排序
    public static double time(String alg, Double[] a) {
        Stopwatch stopwatch = new Stopwatch();
        if (alg.equals("Insertion")) Insertion.sort(a);
        else if (alg.equals("Selection")) Selection.sort(a);
        else if (alg.equals("Shell")) Shell.sort(a);
        return stopwatch.elapsedTime();
    }

    public static double timeRandomInput(String alg, int N, int T) {
        double total = 0.0;
        for (int t = 0; t < T; t++) {
            Double[] a = new Double[N];
            for (int n = 0; n < N; n++)
                a[n] = StdRandom.uniform();
            total += time(alg, a);
        }
        return total;
    }

    public static void main(String[] args) {
        String alg1 = args[0];
        String alg2 = args[1];
        int N = Integer.parseInt(args[2]);
        int T = Integer.parseInt(args[3]);
        double algTime = timeRandomInput(alg1, N, T);
        double algTime2 = timeRandomInput(alg2, N, T);
        StdOut.printf("N %s %s\n", alg1, alg2);
        StdOut.printf("%d %.1f %.1f\n", N, algTime , algTime2);
    }
}
