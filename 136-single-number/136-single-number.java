class Solution {
    public int singleNumber(int[] nums) {
        Set<Integer> s = new HashSet<>();
        for(int item : nums){
            if(!s.contains(item)){
                s.add(item);
            }
            else{
                s.remove(item);
            }
        }
        int res = 0;;
        for(int elem: s){
            res = elem;
        }
        return res;
    }
}