package cat10.cat12;

/**
 * @author wusd
 * @date 2020/4/8 10:13
 */
public class Accumulator {
    private double total;
    private int N;

    public void addDataValue(double val) {
        N++;
        total += val;
    }
    public double mean() {
        return total / N;
    }

    @Override
    public String toString() {
        return "Accumulator{" +
                "total=" + total +
                ", N=" + N +
                '}';
    }
}
