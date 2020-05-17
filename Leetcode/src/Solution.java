import java.util.*;

class Solution {
    public static class TreeNode {
        int val;
        Solution.TreeNode left;
        Solution.TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, Solution.TreeNode left, Solution.TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public int pathSum(TreeNode root, int sum) {
        if(root == null) return 0;
        return getpath(root, sum) +pathSum(root.left, sum) + pathSum(root.right, sum);
    }

    public int getpath(TreeNode root, int sum) {
        if(root==null)
            return 0;
        if(root.val == sum)
            return 1;
        return getpath(root.left, sum-root.val)+getpath(root.right, sum-root.val);

    }
}