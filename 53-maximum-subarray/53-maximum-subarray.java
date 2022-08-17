class Solution {
    public int maxSubArray(int[] nums) {
        
        int maxSum     = Integer.MIN_VALUE;
        int currentSum = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > currentSum && currentSum < 0){
                currentSum = nums[i];
                maxSum = Math.max(currentSum, maxSum);
                continue;
            }
            currentSum += nums[i];
            maxSum = Math.max(currentSum, maxSum);
            
            
        }
        return maxSum;
    }
}
// class Solution {
//     public int maxSubArray(int[] nums) {
        
//         int sum = Integer.MIN_VALUE;
//         for(int i = 0; i < nums.length; i++){
//             int localSum = 0;
//             for(int j = i; j < nums.length; j++){
//                 localSum += nums[j];
//                 sum = Math.max(localSum, sum);
//             }
//         }
        
//         return sum;
        
//     }
// }