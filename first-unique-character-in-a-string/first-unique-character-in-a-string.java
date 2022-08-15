class Solution {
    public int firstUniqChar(String s) {
        Map<Character, List<Integer>> map = new HashMap<>();
        
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(!map.containsKey(c)){
                List<Integer> occurenceAndIndex = new ArrayList<>();
                occurenceAndIndex.add(1); occurenceAndIndex.add(i); 
                map.put(c, occurenceAndIndex);
            }
            else{
                List<Integer> occurenceAndIndex = new ArrayList<>();
                occurenceAndIndex = map.get(c);
                int prev = occurenceAndIndex.get(0);
                occurenceAndIndex.set(0, prev+1);
            }
        }
        int minIndex = Integer.MAX_VALUE;
        for(Map.Entry<Character, List<Integer>> entry : map.entrySet()){
            if(minIndex > entry.getValue().get(1) && entry.getValue().get(0) == 1){
                minIndex = entry.getValue().get(1);
            }
            //System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
        return minIndex == Integer.MAX_VALUE ? -1 : minIndex;
    }
}