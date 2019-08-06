package two;

import edu.princeton.cs.algs4.StdOut;

import java.util.Iterator;

public class ResizingArrayStack<Item> implements Iterable<Item> {
    private Item[] a = (Item[]) new Object[1];
    private int N = 0;

    public int size() {
        return N;
    }

    public boolean isEmpty() {
        return N == 0;
    }

    public void push(Item item) {
        if (a.length == N) resize(2 * a.length);
        a[N++] = item;
    }

    public Item pop() {
        if (N > 0 && a.length / 4 == N) resize(a.length / 2);
        Item temp = a[--N];
        a[N] = null;
        return temp;
    }

    private void resize(int max) {
        Item[] temp = (Item[]) new Object[max];
        for (int i = 0; i < N; i++)
            temp[i] = a[i];
        a = temp;
    }

    @Override
    public Iterator<Item> iterator() {
        return new StackIterator<>(a, N);
    }

    private static class StackIterator<Item> implements Iterator<Item> {
        private Item[] a;
        private int N;
        private int M = 0;
        public StackIterator(Item[] a, int N) {
            this.a = a;
            this.N = N;
        }

        @Override
        public boolean hasNext() {
            return N != M;
        }

        @Override
        public Item next() {
            return a[M++];
        }
    }

    public static void main(String[] args) {
        ResizingArrayStack<Integer> stack = new ResizingArrayStack<>();
        for (int i = 0; i < 10; i++) {
            stack.push(i);
        }
        for (Integer i : stack) {
            StdOut.println(i);
        }
    }
}
