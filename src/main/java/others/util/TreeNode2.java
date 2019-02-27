package others.util;

public class TreeNode2<E> {
    public TreeNode2 left;
    public TreeNode2 right;
    public E val;

    public TreeNode2(E val, TreeNode2 left, TreeNode2 right) {
        this.left = left;
        this.right = right;
        this.val = val;
    }

    public void left(TreeNode2 node) {
        this.left = node;
    }

    public void right(TreeNode2 node) {
        this.right = node;
    }

}