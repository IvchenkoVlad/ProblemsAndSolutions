import java.util.Arrays;
class Solution {
    public int missingNumber(int[] nums) {
        Set<Integer> s = new HashSet<>();
        for(int i = 0 ; i <= nums.length; i++){
            s.add(i);
        }
        System.out.println(s);
        int res = -1;
        for(int item : nums){
            if(s.contains(item)){
                s.remove(item);
            }
        }
        for(int item : s){
            res = item;
        }
        return res;
        
    }
}