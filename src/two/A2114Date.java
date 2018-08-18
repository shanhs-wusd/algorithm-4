package two;

public class A2114Date implements Comparable<A2114Date>{
    private final int day;
    private final int month;
    private final int year;
    public A2114Date(int d, int m, int y) {
        day = d;
        month = m;
        year = y;
    }

    /**
     * v.compareTo(w)
     * 对于v<w, v=w和v>w三种情况,Java习惯在被调用后分别返回-1,0,1
     * v>w,表示v.compareTo(w)
     * 此外: compareTo必须实现一个完整的比较序列
     * 即: 自反性, 对于所有的v, v=v;
     * 反对称性,对于所有v<w,w>v
     * 传递性
     * @param that
     * @return
     */
    @Override
    public int compareTo(A2114Date that) {
        if (this.year > that.year) return +1;
        if (this.year < that.year) return  -1;
        if (this.month > that.month) return +1;
        if (this.month < that.month) return -1;
        if (this.day > that.day) return +1;
        if (this.day < that.day) return -1;
        return 0;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "A2114Date{" +
                "day=" + day +
                ", month=" + month +
                ", year=" + year +
                '}';
    }
}
