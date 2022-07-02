class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0){
                    return 0;
            }
            Arrays.sort(nums);
            
            int tMax = 1;
            int curMax = 1;
            
            for(int i = 1; i < nums.length; i++){
                    if(nums[i] != nums[i-1]){ // skip equal
                            if(nums[i] == nums[i-1] + 1){
                                    curMax ++;
                            }
                            else{
                            tMax = Math.max(tMax, curMax);
                            curMax = 1;
                            }
                    }
            }
        return Math.max(tMax, curMax);
    }
}