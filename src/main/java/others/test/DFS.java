package others.test;

import others.util.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DFS {

    private List<List<Integer>> res = new ArrayList<>();

    public static void main(String[] args) {
        TreeNode root = TreeNode.buildExample();

        DFS dfs = new DFS();
        List<List<Integer>> levelOrder = dfs.levelOrderDFS(root);
        printf(levelOrder);

        printf(levelOrderBFS(root));
    }

    private List<List<Integer>> levelOrderDFS(TreeNode root) {
        dfs(root, 0);
        return res;
    }

    private void dfs(TreeNode node, int level) {
        if (node == null)
            return;
        if (res.size() == level)
            res.add(new ArrayList<>());
        res.get(level).add(node.val);
        if (node.left != null)
            dfs(node.left, level + 1);
        if (node.right != null)
            dfs(node.right, level + 1);
    }

    private static List<List<Integer>> levelOrderBFS(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null)
            return res;
        Queue<TreeNode> nodes = new LinkedList<>();
        nodes.add(root);
        while (!nodes.isEmpty()) {
            int levelSize = nodes.size();
            List<Integer> levelNodes = new ArrayList<>();
            for (int i = 0; i < levelSize; i++) {
                TreeNode node = nodes.poll();
                levelNodes.add(node.val);
                if (node.left != null)
                    nodes.add(node.left);
                if (node.right != null)
                    nodes.add(node.right);
            }
            res.add(levelNodes);
        }
        return res;
    }

    public static void printf(List<List<Integer>> levelOrder) {
        levelOrder.forEach(level -> {
            level.forEach(val -> System.out.print(val + "\t"));
            System.out.println();
        });
    }
}
