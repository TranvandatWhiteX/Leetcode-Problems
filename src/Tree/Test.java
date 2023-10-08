package Tree;

public class Test {
    public static void main(String[] args) {
        BinarySearchTreeImpl<Integer> binarySearchTree = new BinarySearchTreeImpl<>();
        binarySearchTree.setRoot(binarySearchTree.init());
        binarySearchTree.add(16);
        System.out.println(binarySearchTree.height());
        System.out.println(binarySearchTree.contains(100));
    }
}
