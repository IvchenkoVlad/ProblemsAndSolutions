import java.util.Hashtable;
import java.util.Arrays;
import java.util.Map;

class Solution {
    public static boolean canConstruct(String ransomNote, String magazine) {
        char [] ransomNoteArr = ransomNote.toCharArray();
        char [] magazineArr = magazine.toCharArray();
        Arrays.sort(ransomNoteArr);
        Arrays.sort(magazineArr);
            
        boolean flag = false;

        Hashtable<Character, Integer> r_dict = remap(ransomNoteArr);
        Hashtable<Character, Integer> m_dict = remap(magazineArr);
//
        for (Map.Entry<Character,Integer> entry : r_dict.entrySet()) {
            Character a = entry.getKey();
            Integer b = entry.getValue();
            if(m_dict.containsKey(a)){
                Integer value = m_dict.get(a);
                if(value >= b){
                    flag = true;
                }
                else{
                        flag = false;
                        break;
                }
            }
            else{
                flag = false;
                break;
            }
        }
        return flag;
    }
        public static Hashtable<Character, Integer> remap (char[] array){
        Hashtable<Character, Integer> r_dict = new Hashtable<Character, Integer>();
        char current = array[0];
        int counter = 1;
        for(int i = 0; i < array.length; i++){
            if(i == array.length - 1){
                    r_dict.put(current,counter);
            }
            else{
                if(current == array[i+1]){
                    counter++;
                }
                else{
                    r_dict.put(current, counter);
                    current = array[i+1];
                    counter = 1;
                }
            }
        }
        return r_dict;
    }
}