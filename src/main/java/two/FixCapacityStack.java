package two;

public class FixCapacityStack<Item> {
    private Item[] a;
    private int N;

    public FixCapacityStack(int cap) {
        a = (Item[]) new Object[cap];
    }

    public void push(Item item) {
        if (N == a.length) resize(a.length * 2);
        a[N++] = item;
    }

    public Item pop() {
        Item temp = a[--N];
        a[N] = null;
        if (N > 0 && N == a.length / 4) resize(a.length / 2);
        return temp;
    }

    public int size() {
        return N;
    }

    public boolean isEmpty() {
        return N == 0;
    }

    private void resize(int max) {
        Item[] temp = (Item[]) new Object[max];
        for (int i = 0; i < N; i++)
            temp[i] = a[i];
        a = temp;
    }

}
