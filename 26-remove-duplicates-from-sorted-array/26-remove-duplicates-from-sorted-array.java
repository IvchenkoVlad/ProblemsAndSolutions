class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        int uniqPlace = 0;
        for(int i = 0; i < nums.length; i++){
            if(set.add(nums[i])){
                nums[uniqPlace] = nums[i];
                uniqPlace++;
            }
        }
        System.out.println(Arrays.toString(nums));
        return uniqPlace;
    }
}