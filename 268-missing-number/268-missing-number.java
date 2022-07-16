import java.util.Arrays;
class Solution {
    public int missingNumber(int[] nums) {
       int requiredSum = 0;
        int actualSum = 0;
        for(int i = 0; i <= nums.length; i++){
            
            requiredSum += i;
            if(i == nums.length){
                break;
            }
            actualSum += nums[i];
            
        }
        
        return requiredSum - actualSum;
        
        
    }
}