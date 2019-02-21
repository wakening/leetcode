package others.util;

public class TreeNode {
    public TreeNode left;
    public TreeNode right;
    public Integer val;

    public TreeNode(Integer val) {
        this.left = null;
        this.right = null;
        this.val = val;
    }

    public static TreeNode getInstance(Integer val) {
        return new TreeNode(val);
    }

    public TreeNode left(Integer val) {
        this.left = getInstance(val);
        return this;
    }

    public TreeNode right(Integer val) {
        this.right = getInstance(val);
        return this;
    }

    @Override
    public String toString() {
        return "TreeNode{" +
                "left=" + (left == null ? "null" : left.toString()) +
                ", right=" + (right == null ? "null" : right.toString()) +
                ", val=" + val +
                "}";
    }
}