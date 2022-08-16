class Solution {
    public int maximumDifference(int[] nums) {
        
        int min = Integer.MAX_VALUE;
        int difference = 0;
        
        for(int i = 0; i < nums.length; i++){
            
            if(nums[i] < min){
                min = nums[i];
            }
            else{
                if(nums[i] - min > difference){
                    difference = nums[i] - min;
                }
            }
            
        }
        return difference == 0 ? -1 : difference;
    }
}