import java.util.Arrays;

class Solution {
    public boolean isPalindrome(String s) {
        if(s == ""){
            return true;
        }
        s = getArray(s);
        int left = 0;
        int right = s.length()-1;
        
        while(left <= right){/// 8 length 1 7 2 6 3 5 4 4
            if(s.charAt(left) != s.charAt(right)){
               return false;
            }
            left++; right--;
        }
        return true;
    }
    
    public String getArray(String s){
        String res = "";
        for(int i =0; i < s.length(); i ++){
            if(Character.isLetter(s.charAt(i)) || Character.isDigit(s.charAt(i))){
                res += s.charAt(i);
            }
        }
        return res.toLowerCase();
    }
}