package Leetcode.Tree;

import java.util.ArrayList;
import java.util.List;

public class BT_PostOrderTraversal_145 {

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
        public List<Integer> postorderTraversal(TreeNode root) {
            List<Integer> ll = new ArrayList<>();
            Postorder(root, ll);
            return ll;
        }

        public void Postorder(TreeNode root, List<Integer> ll) {
            if (root == null) {
                return;
            }
            Postorder(root.left, ll);
            Postorder(root.right, ll);
            ll.add(root.val);
        }
    }
}
