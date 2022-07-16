class Solution {
    public int findDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        
        for(int item : nums){
            if(seen.contains(item)){
                return item;
            }
            else{
                seen.add(item);
            }
        }
        return -1;
        
    }
}