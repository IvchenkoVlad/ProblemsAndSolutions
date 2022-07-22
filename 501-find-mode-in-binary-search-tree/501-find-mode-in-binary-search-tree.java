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
    public int[] findMode(TreeNode root) {
        Map<Integer, Integer> nodes = new HashMap<Integer, Integer>();
        traverse(root, nodes);
        
        int max = Integer.MIN_VALUE;
        int arrLen = 0;
        for(Map.Entry<Integer, Integer> entry : nodes.entrySet()){
        
            if(entry.getValue() > max){
                max = entry.getValue();
            }
        }
        int counter = 0;
        for(Map.Entry<Integer, Integer> entry : nodes.entrySet()){
            if(entry.getValue() == max){
               counter++;
            }
        }
        int [] arr = new int[counter];
        for(Map.Entry<Integer, Integer> entry : nodes.entrySet()){
            if(arr.length == 0){
                break;
            }
            if(entry.getValue() == max){
               arr[counter-1] = entry.getKey();
                counter--;
            }
        }
        
        return arr;
        
    }
    
    public void traverse(TreeNode root, Map<Integer, Integer> nodes){
        if(root==null){
            return;
        }
        if(!nodes.containsKey(root.val)){
            nodes.put(root.val, 1);
        }
        else{
            nodes.put(root.val, nodes.get(root.val)+1);
        }
        
        //left
        traverse(root.left, nodes);
        //right
        traverse(root.right, nodes);
        
        
    }
}