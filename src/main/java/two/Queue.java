package two;

import edu.princeton.cs.algs4.StdOut;

import java.util.Iterator;

public class Queue<Item> implements Iterable<Item> {
    private class Node {
        Item item;
        Node next;
    }
    private Node first;
    private Node last;
    private int N;

    public void enqueue(Item item) {
        Node oldLast = last;
        last = new Node();
        last.item = item;
        if (isEmpty()) first = last;
        else oldLast.next = last;
        N++;
    }

    public Item dequeue() {
        Node oldFirst = first;
        Item item = oldFirst.item;
        first = oldFirst.next;
        N--;
        return item;
    }

    public int size() {
        return N;
    }

    public boolean isEmpty() {
        return N == 0;
    }

    @Override
    public Iterator<Item> iterator() {
        return null;
    }

    public static void main(String[] args) {
        String tobes = "to be or not to - be - - that - - - is";
        String[] tobeArr = tobes.split(" ");
        Queue<String> queue = new Queue<>();
        for (int i = 0; i < tobeArr.length; i++) {
            queue.enqueue(tobeArr[i]);
        }
        for (int i = 0; i < queue.size(); i++) {
            StdOut.println(queue.dequeue());
        }
    }
}
