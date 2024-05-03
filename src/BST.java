import java.util.LinkedList;
import java.util.Queue;

public class BST<K extends Comparable<K>, V> {
    private Node root;
    private int size; // добавляем размер дерева

    private class Node {
        private K key;
        private V val;
        private Node left, right;

        public Node(K key, V val) {
            this.key = key;
            this.val = val;
        }
    }

    // другие методы класса BST остаются без изменений

    public Iterable<Node> iterator() {
        Queue<Node> keys = new LinkedList<>();
        inorder(root, keys);
        return keys;
    }

    private void inorder(Node x, Queue<Node> keys) {
        if (x == null) return;
        inorder(x.left, keys);
        keys.offer(x);
        inorder(x.right, keys);
    }

    public int size() {
        return size;
    }
}
