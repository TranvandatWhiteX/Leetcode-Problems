package Tree;

public class BinarySearchTreeImpl<E extends  Comparable<E>> {
    private int nodeCount = 0;
    private Node<E> root = null;
    private static class Node<E extends Comparable<E>> {
        E item;
        Node<E> left;
        Node<E> right;
        Node(Node<E> left, E element, Node<E> right) {
            this.item = element;
            this.left = left;
            this.right = right;
        }
    }
    // Init a binary tree
    public Node<Integer> init() {
        Node<Integer> node_9 = new Node<>(null, 55, null);
        Node<Integer> node_8 = new Node<>(null, 12, null);
        Node<Integer> node_7 = new Node<>(null, 9, null);
        Node<Integer> node_6 = new Node<>(null, 34, node_9);
        Node<Integer> node_5 = new Node<>(null, 20, null);
        Node<Integer> node_4 = new Node<>(node_7, 10, node_8);
        Node<Integer> node_3 = new Node<>(null, 2, null);
        Node<Integer> node_2 = new Node<>(node_5, 24, node_6);
        Node<Integer> node_1 = new Node<>(node_3, 7, node_4);
        Node<Integer> node_0 = new Node<>(node_1, 15, node_2);
        return node_0;
    }
    public Node<E> getRoot() {
        return root;
    }
    public void setRoot(Node<E> root) {
        this.root = root;
    }
    public boolean isEmpty() {
        return size() == 0;
    }
    public int size() {
        return nodeCount;
    }
    public int height() {
        return height(root);
    }
    public boolean contains(E element) {
        return contains(root, element);
    }
    public boolean add(E elment) {
        if (contains(elment)) return false;
        root = add(root, elment);
        nodeCount++;
        return true;
    }
    private boolean contains(Node node, E element) {
        if (node == null) return false;
        int result = element.compareTo((E) node.item);
        if (result > 0) {
            return contains(node.right, element);
        } else if (result < 0) {
            return contains(node.left, element);
        } else return true;
    }
    private int height(Node node) {
        if (node == null) return 0;
        else return 1 + Math.max(height(node.left), height(node.right));
    }
    private Node add(Node node, E element) {
        if (node == null) {
            node = new Node(null, element, node);
        } else {
            int result = element.compareTo((E) node.item);
            if (result > 0) {
                node.right = add(node.right, element);
            } else {
                node.left = add(node.left, element);
            }
        }
        return node;
    }
}
