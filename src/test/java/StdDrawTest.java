import edu.princeton.cs.algs4.StdDraw;

public class StdDrawTest {
    public static void main(String[] args) {
        StdDraw.setPenColor(StdDraw.MAGENTA);
        StdDraw.setXscale(0.0, 10.0);
        StdDraw.setYscale(0.0, 10.0);
        StdDraw.line(0, 0, 0, 2);
        StdDraw.line(1, 0, 1, 5);
    }
}
