package one;

public class A000GCD {
    public static int gcd(int p, int q) {
        if (q == 0) return p;
        int r = p % q;
        return gcd(q, r);
    }

    public static void main(String[] args) {
        System.out.println("最大公约数： " + gcd(5, 3));
    }
    /**
     * 程序是对算法精确丶优雅和完全的描述
     * 可以通过运行程序来学习算法的各种性质
     * 在应用程序中直接使用这些算法
     */
}
