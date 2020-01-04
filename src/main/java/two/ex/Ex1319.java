package two.ex;

public class Ex1319<Item> {
    public static class Node<Item> {
        Item item;
        Node next;
    }
    public static void main(String[] args) {
        Node<String> first = new Node<>();
        Node<String> currentNode = first;
        while (currentNode.next.next != null) {
            currentNode = currentNode.next;
        }
        first.next = null;
    }
}
