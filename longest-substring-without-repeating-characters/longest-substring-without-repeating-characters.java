class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        for(int i = 0; i < s.length(); i++){
            Set<Character> set = new HashSet<>();
            int currentMax = 0;
            for(int j = i; j < s.length(); j++){
                if(set.add(s.charAt(j))){
                    currentMax++;
                }
                else{
                    break;
                }
            }
            max = Math.max(currentMax, max);
        }
        return max;
    }
}