class Solution {
    public int longestPalindrome(String s) {
        int total = 0;
        Map<Character, Integer> map = new HashMap<>();
        for(char a : s.toCharArray()){
            if(!map.containsKey(a)){
                map.put(a, 1);
            }
            else{
                map.put(a, map.get(a) + 1);
            }
        }
        
        boolean uneven = false;
        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " -> " + entry.getValue());
            if(entry.getValue()%2==0){
                total += (entry.getValue());
            }
            else{
                if(!uneven){
                    total += (entry.getValue());
                    uneven = true;
                    continue;
                }
                total+= (entry.getValue() / 2) * 2;
            }
        }
        return total;
    }
}