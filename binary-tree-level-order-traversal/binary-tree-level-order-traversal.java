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
        List<List<Integer>> levels = new ArrayList<List<Integer>>();
        helper(root, levels, 0);
        return levels;
        
    }
    public void helper(TreeNode root, List<List<Integer>> levels, int level){
        if(root == null){
            return;
        }
        if(levels.size() == level){
            levels.add(new ArrayList<Integer>());
        }
        levels.get(level).add(root.val);
        helper(root.left, levels, level+1);
        helper(root.right, levels, level+1);
    }
    
}