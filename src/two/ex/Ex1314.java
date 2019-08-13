package two.ex;

import edu.princeton.cs.algs4.StdOut;

public class Ex1314 {
    public static void main(String[] args) {
        ResizingArrayQueueOfStrings<Integer> strings = new ResizingArrayQueueOfStrings<>();
        for (int i = 0; i < 10; i++) {
            strings.enqueue(i);
        }
        for (int i = 0; i < 2; i++) {
            StdOut.println(strings.dequeue());
        }
        for (int i = 10; i < 22; i++) {
            strings.enqueue(i);
        }
        StdOut.println();
    }

}

class ResizingArrayQueueOfStrings<Item> {
    private Item[] elementData;
    private int size;
    private int beginIndex;

    public ResizingArrayQueueOfStrings() {
        elementData = (Item[]) new Object[10];
        size = 0;
        beginIndex = 0;
    }

    public Item dequeue() {
        if (size == elementData.length / 4) resize(elementData.length / 2);
        Item item = elementData[beginIndex];
        beginIndex = ++beginIndex % elementData.length;
        size--;
        return item;
    }

    public void resize(int maxLen) {
        Item[] newElementData = (Item[]) new Object[maxLen];
        for (int i = 0; i < size; i++) {
            newElementData[i] = elementData[(i + beginIndex) % size];
        }
        elementData = newElementData;
        beginIndex = 0;
    }

    public void enqueue(Item item) {
        if (size == elementData.length) resize(elementData.length * 2);
        int nextIndex = (beginIndex + size) % elementData.length;
        size++;
        elementData[nextIndex] = item;
    }

    public int size() {
        return size;
    }
}
