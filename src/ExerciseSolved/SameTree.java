package ExerciseSolved;

// Leet code 100
public class SameTree {
    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {
        }
        TreeNode(int val) {
            this.val = val;
        }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p==null && q==null) return true;
        if (p == null || q == null || p.val != q.val) {
            return false;
        }
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

    public static void main(String[] args) {
        TreeNode node_3 = new TreeNode(12, null, null);
        TreeNode node_2 = new TreeNode(6, null, null);
        TreeNode root1 = new TreeNode(8, node_2, node_3);

        TreeNode node_5 = new TreeNode(11, null, null);
        TreeNode node_4 = new TreeNode(6, null, null);
        TreeNode root2 = new TreeNode(8, node_4, node_5);
        System.out.println(isSameTree(root1, root2));
    }
}
