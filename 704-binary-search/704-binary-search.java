class Solution {
    public int search(int[] nums, int target) {
        return bs(nums, target, 0, nums.length-1);
    }
    
    public int bs(int [] nums, int target, int left, int right){
        int mid = (left + right) / 2;
        
        while(left <= right){
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] < target){
                return bs(nums, target, mid + 1, right);
            }
            else{
                return bs(nums, target, left, mid - 1);
            }
        }
        return -1;
    }
}