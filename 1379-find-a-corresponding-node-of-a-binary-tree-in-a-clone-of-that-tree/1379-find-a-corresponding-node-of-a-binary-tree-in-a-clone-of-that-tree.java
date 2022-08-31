/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    TreeNode answer = new TreeNode(-999);
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        helper(original, cloned, target);
        return answer;
    }
    
    public boolean helper(TreeNode original, TreeNode cloned, TreeNode target){
        if(original == null && cloned == null && target != null){
            return false;
        }
        if(original.val == cloned.val && cloned.val == target.val){
            answer = cloned;
            return true;
        }
        return helper(original.left, cloned.left, target) || 
             helper(original.right, cloned.right, target);
    }
}