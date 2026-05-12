/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    int maximumDiameter = 0;

    public int diameter(TreeNode root) {
        if(root == null) {
            return 0;
        }

        int leftTree = diameter(root.left);
        int rightTree = diameter(root.right);

        if(leftTree + rightTree > maximumDiameter) {
            maximumDiameter = leftTree + rightTree;
        }

        return Math.max(leftTree, rightTree) + 1;
    }
    public int diameterOfBinaryTree(TreeNode root) {
        diameter(root);
        return maximumDiameter;
    }
}
