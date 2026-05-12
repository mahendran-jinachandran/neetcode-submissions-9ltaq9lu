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
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        if(root == null) {
            return new ArrayList<>();
        }

        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> outer = new ArrayList<>();
        queue.add(root);
        int currentLevel = 0;

        while(!queue.isEmpty()) {
            outer.add(new ArrayList<>());

            int size = queue.size();
            for(int i = 0; i < size; i++) {

                TreeNode temp = queue.poll();
                outer.get(currentLevel).add(temp.val);

                if(temp.left != null) {
                    queue.add(temp.left);
                }

                if(temp.right != null) {
                    queue.add(temp.right);
                }
            }

            currentLevel++;
        }

        return outer;
    }
}
