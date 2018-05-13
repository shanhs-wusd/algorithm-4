package one;

public class ArrayCal {
    /**
     * 数组最大值
     * @param a
     * @return
     */
    public double max(double[] a) {
        double max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) max = a[i];
        }
        return max;
    }

    /**
     * 计算数组的平均数
     */
    public double average(double[] a) {
        int N = a.length;
        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += a[i];
        }
        return sum / N;
    }

    /**
     * 复制数组
     */
    public double[] copyArr(double[] a) {
        int N = a.length;
        double[] b = new double[N];
        for (int i = 0; i < N; i++) {
            b[i] = a[i];
        }
        return b;
    }
    /**
     * 颠倒数组中元素的顺序
     */
    public double[] reversal(double[] a) {
        int N = a.length;
        for (int i = 0; i < N/2; i++) {
            double temp = a[i];
            a[i] = a[N - 1 - i];
            a[N - 1 - i] = temp;
        }
        return a;
    }
    /**
     * 矩阵的乘法
     */
    public double[][] multipication(double[][] a, double[][] b) {
        int N = a.length;
        double[][] c = new double[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < N; k++)
                c[i][j] += a[i][k] * b[k][j];
            }
        }
        return c;
    }
}




































































































