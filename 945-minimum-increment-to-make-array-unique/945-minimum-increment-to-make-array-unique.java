class Solution {
    
    public int minIncrementForUnique(int[] nums){
        Arrays.sort(nums);
        int counter = 0;
        for(int i = 0; i < nums.length-1; i++){
            
            while(nums[i] >= nums[i+1]){
                nums[i+1] = nums[i+1] + 1;
                counter ++;
            }
            
        }
        return counter;
    }
//     public int minIncrementForUnique(int[] nums) {
//         int counter = 0;
//         while(findDupIndex(nums) != -1){
//             int index = findDupIndex(nums);
//             nums[index] = nums[index] + 1;
//             counter++;
//         }
        
//         return counter;
//     }
    
//     public int findDupIndex(int [] nums){
//         Set<Integer> set = new HashSet<>();
//         for(int i = 0; i < nums.length; i++){
//             if(set.contains(nums[i])){
//                 return i;
//             }
//             else{
//                 set.add(nums[i]);
//             }
//         }
//         return -1;
//     }
}