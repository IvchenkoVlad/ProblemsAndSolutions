class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean incr = false;
        boolean decr = false;
        boolean mono = true;
        
        
        for(int i = 0 ; i < nums.length-1; i++){
            if(nums[i] == nums[i+1]){
                continue;
            }
            if(!decr && !incr){
                if(nums[i] > nums[i+1]){
                    //decr
                    decr = true;
                }
                else if(nums[i] < nums[i+1]){
                    //incr
                    incr = true;

                }
            }
            if(decr){
               if(!(nums[i] >= nums[i+1])){
                   mono = false;
               } 
            }
            else if(incr){
                if(!(nums[i] <= nums[i+1])){
                    mono = false;
                }
            }
            
        }
        
        return mono;
    }
}