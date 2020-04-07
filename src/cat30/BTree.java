package cat30;

import edu.princeton.cs.algs4.StdRandom;

/**
 * @author wusd
 * @date 2020/3/13 21:54
 */
public class BTree {
    private Node root;

    protected class Node {
        private Integer key;
        private String val;
        private Node left, right;
        private int N;

        public Node(Integer key, String val, int N) {
            this.key = key;
            this.val = val;
            this.N = N;
        }
    }

    public int size() {
        return size(root);
    }

    private int size(Node x) {
        if (x == null) return 0;
        return x.N;
    }

    public String get(Integer key) {
        return get(root, key);
    }

    private String get(Node x, Integer key) {
        if (x == null) return null;
        int cmp = x.key.compareTo(key);
        if (cmp < 0) get(x.right, key);
        else if (cmp > 0) get(x.left, key);
        return x.val;
    }

    public void put(Integer key, String val) {
        //无则为其创建一个
        root = put(root, key, val);
    }

    private Node put(Node x, Integer key, String val) {
        if (x == null) return new Node(key, val, 1);
        int cmp = x.key.compareTo(key);
        if (cmp < 0) x.right = put(x.right, key, val);
        else if (cmp > 0) x.left = put(x.left, key, val);
        else x.val = val;
//!        x.N++;不一定成立
        x.N = size(x.left) + size(x.right) + 1;
        return x;
    }

    public static void main(String[] args) {
        BTree bTree = new BTree();
        for (int i = 1; i < 1000; i++) {
            Integer key = StdRandom.uniform(1000);
            String val = "x";
            bTree.put(key, val);
        }
    }

    public void testNullRef() {
        nullRef();
    }

    public static void nullRef() {
        Model nullRef = null;
        impl(nullRef);
        System.out.println(nullRef);
    }

    public static void impl(Model nullRef) {
        nullRef = new Model("d");
    }

    static class Model {
        private String id;

        public Model(String id) {
            this.id = id;
        }
    }
}
