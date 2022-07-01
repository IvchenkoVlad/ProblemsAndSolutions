import java.util.Arrays;

class Solution {
    public boolean isPalindrome(String s) {
        if(s == ""){
            return true;
        }
        
        char [] rawArray = getArray(s);
        int left = 0;
        int right = rawArray.length-1;
        System.out.println(rawArray.length);
        
        while(left <= right){/// 8 length 1 7 2 6 3 5 4 4
            if(rawArray[left] != rawArray[right]){
               return false;
            }
            left++; right--;
        }
        return true;
    }
    
    public char [] getArray(String s){
        String res = "";
        for(int i =0; i < s.length(); i ++){
            if(Character.isLetter(s.charAt(i)) || Character.isDigit(s.charAt(i))){
                res += s.charAt(i);
            }
        }
        res = res.toLowerCase();
        return res.toCharArray();
    }
}