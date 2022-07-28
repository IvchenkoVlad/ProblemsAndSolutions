class Solution {
    public int[] twoSum(int[] numbers, int target) {
        // 2 7 11 15
        Map<Integer, Integer> map = new HashMap<>(); 
        int ans[] = new int[2];
        //in map we store occurences
        for(int i = 0; i < numbers.length; i++){
            int key = numbers[i];
            if(!map.containsKey(key)){
                map.put(target - key, i);
            }else{
                ans[0] = map.get(key) + 1;
                ans[1] = i + 1;
            }
        }
        return ans;
    }
}