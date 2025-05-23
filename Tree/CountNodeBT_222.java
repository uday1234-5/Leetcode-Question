package Leetcode.Tree;

public class CountNodeBT_222 {
    public class TreeNode {
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

    class Solution {
        public int countNodes(TreeNode root) {
            if(root == null) {
                return 0;

            }

            int leftNode = countNodes(root.left);
            int rightNode = countNodes(root.right);
            return leftNode + rightNode +1;
        }
    }
}
