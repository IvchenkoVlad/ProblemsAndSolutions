class Solution {
    public boolean isAnagram(String s, String t) {
        
        Map<Character, Integer> map = new HashMap<>();
        //adding first
        for(char ch : s.toCharArray()){
            if(!map.containsKey(ch)){
                map.put(ch, 1);
            }
            else{
                map.put(ch, map.get(ch) + 1);
            }
        }
        //checking second
        for(char ch : t.toCharArray()){
            if(!map.containsKey(ch)){
                return false;
            }
            else{
                map.put(ch, map.get(ch) - 1);
            }
        }
        
        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            if(entry.getValue() != 0){
                return false;
            }
        }
        return true;
    }
}