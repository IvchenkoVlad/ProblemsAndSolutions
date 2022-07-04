class Solution {
    public int singleNumber(int[] nums) {
        
        Map<Integer, Integer> maps = new HashMap<>();
        for(int item : nums){
            if(!maps.containsKey(item)){
                maps.put(item, 1);
            }
            else{
                maps.put(item, maps.get(item) + 1);
            }
        }
        
        for(Map.Entry<Integer, Integer> entry : maps.entrySet()){
            if(entry.getValue() == 1){
                return entry.getKey();
            }
        }
        return 0;
        
    }
}