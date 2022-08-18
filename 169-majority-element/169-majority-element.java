class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[(0+(nums.length-1 - 0)/2)];
    }
}