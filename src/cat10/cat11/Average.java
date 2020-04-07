package cat10.cat11;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * @author wusd
 * @date 2020/3/21 17:25
 */
public class Average {
    public static void main(String[] args) {
        double sum = 0.0;
        int cnt = 0;
        while (!StdIn.isEmpty()) {
            sum += StdIn.readDouble();
            cnt++;
        }
        double avg = sum / cnt;
        StdOut.printf("Average is %.5f\n", avg);
    }
}
