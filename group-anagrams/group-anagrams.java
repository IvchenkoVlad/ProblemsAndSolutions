class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<List<String>,List<String>> map = new HashMap<>();
        for(String word : strs){
            List<String> list = new ArrayList<>();
            for(char ch : word.toCharArray()){
                list.add(ch+"");
            }
            Collections.sort(list, (a,b) -> a.compareTo(b));
            //System.out.println(list);
            if(!map.containsKey(list)){
                List<String> items = new ArrayList<>();
                items.add(word);
                map.put(list, items);
            }
            else{
                List<String> items = map.get(list);
                items.add(word);
                map.put(list, items);
            }
            
        }
        List<List<String>> answer = new ArrayList<>();
        for(Map.Entry<List<String>,List<String>> entry : map.entrySet()){
            answer.add(entry.getValue());
        }
       
        return answer;
    }
}