package two;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Iterator;

public class Stack<Item> implements Iterable<Item> {
    private Node first;
    private int N;

    private class Node {
        private Item item;
        private Node next;
    }

    public int size() {
        return N;
    }

    public boolean isEmpty() {
        return N == 0;
    }

    public void push(Item item) {
        Node oldFirst = first;
        first = new Node();
        first.item = item;
        first.next = oldFirst;
        N++;
    }

    public Item peek() {
        return first.item;
    }

    public Item pop() {
        Node oldFirst = first;
        Item item = oldFirst.item;
        first = oldFirst.next;
        N--;
        return item;
    }

    public Stack<Item> copy(Stack<Item> stack) {
        Stack<Item> copyStack = new Stack<>();
        Stack<Item> tempStack = new Stack<>();
        for (Item item : stack) {
            tempStack.push(item);
        }
        for (Item item : tempStack) {
            copyStack.push(item);
        }
        return copyStack;
    }

    @Override
    public Iterator<Item> iterator() {
        return new StackIterator();
    }

    private class StackIterator implements Iterator<Item> {
        private Node currentNode = first;

        @Override
        public boolean hasNext() {
            return currentNode != null;
        }

        @Override
        public Item next() {
            Item item = currentNode.item;
            currentNode = currentNode.next;
            return item;
        }
    }

    public static void main(String[] args) {
        String wis = "whihi";
        Stack<String> ss = new Stack<>();
        for (String wi : wis.split("")) {
            ss.push(wi);
        }
        Stack<String> copy = ss.copy(ss);
        StdOut.println();
//        Stack<String> s = new Stack<>();
//        while (!StdIn.isEmpty()) {
//            String item = StdIn.readString();
//            if (!item.equals("-"))
//                s.push(item);
//            else if (!s.isEmpty()) StdOut.print(s.pop() + " ");
//        }
//        StdOut.println("(" + s.size() + " left on stack");
    }
}
