class Solution {
    public int[] runningSum(int[] nums) {
        int [] result = new int[nums.length];
        for(int i = 0; i < nums.length; i ++){
            int j = i;
            while(j>=0){
                result[i] += nums[j];
                j--;
            }
        }
        
        //System.out.println(Arrays.toString(result));
        return result;
    }
}