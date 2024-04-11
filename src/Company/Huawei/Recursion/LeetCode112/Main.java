package Company.Huawei.Recursion.LeetCode112;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    public static boolean hasPathSum(TreeNode root, int targetSum) {

        if (root == null) return false;

        if (root.left == null && root.right == null) return root.val == targetSum;

        return hasPathSum(root.left, targetSum - root.val) || hasPathSum(root.right, targetSum - root.val);

    }

    public static void preOrderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.val + " ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }

    public static TreeNode buildTreeFromArray(Integer[] array) { // 使用队列把这棵树构建出来
        if (array == null || array.length == 0 || array[0] == null) {
            return null;
        }

        TreeNode root = new TreeNode(array[0]);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        for (int i = 1; i < array.length; i++) {
            TreeNode parent = queue.peek();
            if (parent == null) {
                continue;
            }

            TreeNode newNode = null;
            if (array[i] != null) {
                newNode = new TreeNode(array[i]);
                queue.offer(newNode);
            }

            if (i % 2 == 1) {
                parent.left = newNode;
            } else {
                parent.right = newNode;
                queue.poll(); // Move to the next level
            }
        }

        return root;
    }


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        Integer[] array = new Integer[]{5, 4, 8, 11, null, 13, 4, 7, 2, null, null, null, 1};

        TreeNode root = buildTreeFromArray(array);

        int target = in.nextInt();

        System.out.println(hasPathSum(root, target));

    }

}

class TreeNode {
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