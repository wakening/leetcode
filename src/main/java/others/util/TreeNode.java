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

    /** eg:
     *          6
     *    3           10
     *  1   4      7    16
     * 0 2          8     20
     */
    public static TreeNode buildExample() {
        TreeNode root = TreeNode.getInstance(6).left(3).right(10);
        root.left.left(1).right(4).left.left(0).right(2);
        TreeNode levelTwoRight = root.right.left(7).right(16);
        levelTwoRight.left.right(8);
        levelTwoRight.right.right(20);
        return root;
    }
}
