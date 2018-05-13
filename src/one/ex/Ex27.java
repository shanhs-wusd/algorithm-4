package one.ex;

public class Ex27 {
    public static double binomial(int N, int k, double p) {
        if (N == 0 && k == 0) return 1.0;
        if (N < 0 || k < 0) return 0;
        /**
         * (1.0 - p) 失败 binomial(99, 50, p) 99次出现50的概率
         * p 成功 binomial(99, 49, p) 99次出现49的概率
         */
        return (1.0 - p) * binomial(N - 1, k , p) + p * binomial(N - 1, k - 1, p);
    }
}
