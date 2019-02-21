package others;

import others.util.TreeNode;

/**
 * 无效的二叉搜索树
 */
public class ValidateBinarySearchTree98 {

    public static void main(String[] args) {
        /* eg:
         *          6
         *    3           9
         *  1   4      7    10
         * 0 2
         */
        TreeNode root = TreeNode.getInstance(6).left(3).right(9);
        root.left.left(1).right(4).left.left(0).right(2);
        root.right.left(7).right(10);
        System.out.println(isValid(root, null, null));
    }

    private static boolean isValid(TreeNode root, Integer min, Integer max) {
        if (root == null) return true;
        System.out.print(root.val + "\t");
        if (min != null && root.val <= min) return false; // 右子树需大于跟
        if (max != null && root.val >= max) return false; // 左子树需小于跟
        return isValid(root.left, min, root.val) && isValid(root.right, root.val, max);
    }

}
