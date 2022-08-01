class Solution {
    public int searchInsert(int[] nums, int target) {
        int closestIndex = -1;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == target){
                return i;
            }
            if(nums[i] > target){
                return i;
            }
            if(nums[i] < target){
                closestIndex = i+1;
            }
        }
        return closestIndex;
    }
}