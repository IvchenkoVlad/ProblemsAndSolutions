class Solution {
    public int[] plusOne(int[] digits) {
        int remainder = 0;
        for(int i = digits.length -1 ; i >= 0; i--){
            if(digits[i] < 9 && remainder == 0){
               digits[i] = digits[i] + 1; 
                break;
            }
            if(digits[i] < 9 && remainder != 0){
               digits[i] = digits[i] + remainder; 
                remainder = 0;
                break;
            }
            if(digits[i] == 9 && i != 0){
               digits[i] = 0;
               remainder = 1;
            }
            if(digits[i] == 9 && i == 0){
                //move all right
                digits[i] = 0;
                int [] copy = digits;
                digits = new int[copy.length+1];
                digits[0] = 1;
               for(int j=0; j < copy.length; j++){
                   digits[j+1] = copy[j];
               }               
            }
        }
        return digits;
    }
    
}