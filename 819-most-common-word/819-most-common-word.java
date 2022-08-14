class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        paragraph = cleanUpString(paragraph);
        Map<String, Integer> map = new HashMap<>();
        for(String item : paragraph.split("\\s+")){
            if(isBanned(item, banned)){
                continue;
            }
            if(!map.containsKey(item)){
                map.put(item, 1);
            }
            else{
                map.put(item, map.get(item) + 1);
            }
        }
        int max = Integer.MIN_VALUE;
        String maxW = "";
        for(Map.Entry<String,Integer> entry : map.entrySet()){
            if(entry.getValue() > max){
                max = entry.getValue();
                maxW = entry.getKey();
            }
        }
        
        return maxW;
    }
    public boolean isBanned(String word, String [] banned){
        for(String item : banned){
            if(word.equals(item)){
                return true;
            }
        }
        return false;
    }
    public String cleanUpString(String paragraph){
        StringBuilder sb = new StringBuilder();
        for(char a : paragraph.toCharArray()){
            if(Character.isLetter(a)){
                sb.append(Character.toLowerCase(a));
            }
            else if(a == ' '){
                sb.append(a);
            }
            else{
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}