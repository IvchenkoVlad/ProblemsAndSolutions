class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int [] result = new int[nums.length];
        int front = 0;
        int back = nums.length-1;
        for(int item: nums){
            
            if(item % 2 == 0){//even
                result[front] = item;
                front++;
            }
            else if(item % 2 != 0){//odd
                result[back] = item;
                back--;
            }
        }
        return result;
    }
}