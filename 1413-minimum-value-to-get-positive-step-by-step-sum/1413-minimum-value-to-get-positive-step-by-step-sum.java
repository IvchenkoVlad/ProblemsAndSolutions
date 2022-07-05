class Solution {
    public int minStartValue(int[] nums) {
        int value = 0;
        int minValue = 0;
        
        for(int item : nums){
            value += item;
            minValue = Math.min(value, minValue);
            //System.out.println(minValue);
        }
        return 1 - minValue;
    }
}