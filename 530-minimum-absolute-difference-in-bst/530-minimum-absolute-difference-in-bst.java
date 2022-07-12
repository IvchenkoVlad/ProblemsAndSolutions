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
    
    int min = Integer.MAX_VALUE;
    Integer previousValue = null; 
    

    public int getMinimumDifference(TreeNode root) {
        if(root == null) { 
            return min;
        }
        
        getMinimumDifference(root.left); 
        
        if(previousValue != null) { 
            min = Math.min(min, root.val - previousValue);
        }
        System.out.println("Prev = " + previousValue + " root = " + root.val);
        previousValue = root.val;
        
        
        
        getMinimumDifference(root.right);
        
        return min;
    }
    
}
