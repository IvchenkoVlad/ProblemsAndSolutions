class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            if(!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i), i);
            }
            else{
                map.put(s.charAt(i), -1);
            }
        }
        int smallest = Integer.MAX_VALUE;
        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            if(entry.getValue() != -1){
                smallest = Math.min(smallest, entry.getValue());
            }
        }
        return smallest != Integer.MAX_VALUE ? smallest : -1;
        
    }
}