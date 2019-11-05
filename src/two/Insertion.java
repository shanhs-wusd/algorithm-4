package two;

public class Insertion {
    public static void main(String[] args) {

    }

    public static void sort(Comparable[] a) {
        int i = 1;
        if (Example.less(a[i], a[i - 1])) {
            Example.exch(a, i, i - 1);
        }
    }
}
