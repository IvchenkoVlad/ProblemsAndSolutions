import java.util.ArrayList;
class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        String [] arr1 = s1.split(" ");
        String [] arr2 = s2.split(" ");
        
        List<String> l1 = Arrays.asList(arr1);
        List<String> l2 = Arrays.asList(arr2);
        
        ArrayList<String> result = new ArrayList<String>();
        ArrayList<String> duplicates = new ArrayList<String>();

        for(String item : l1){
            if(!l2.contains(item) && !duplicates.contains(item)){
                if(result.contains(item)){
                    result.remove(item);
                    duplicates.add(item);
                }
                else{
                    result.add(item);
                }
            }
        }
        
        for(String item : l2){
            if(!l1.contains(item) && !duplicates.contains(item)){
                if(result.contains(item)){
                    result.remove(item);
                    duplicates.add(item);
                }
                else{
                    result.add(item);
                }
            }
        }
        
        String [] arrResult = result.toArray(new String[0]);
        return arrResult;
    }
}