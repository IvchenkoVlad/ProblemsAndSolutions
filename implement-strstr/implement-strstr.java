class Solution {
    public int strStr(String haystack, String needle) {
if (needle.length() == 0) {
            return 0;
        }
        
        int needlePointer = 0;
        int haystackPointer = 0;
        
        while (haystackPointer < haystack.length()) {
            
           if (haystack.charAt(haystackPointer) == needle.charAt(needlePointer)) {
               needlePointer++;
           }
            else {
                haystackPointer = haystackPointer - needlePointer;
                needlePointer = 0;
            }
            
            haystackPointer++;
            
            if (needlePointer == needle.length()) {
                   
                return (haystackPointer - needle.length());
                   
            }
            
        }
        
        return -1;
}
        
        
        /*
        if(haystack.length() < needle.length()){
            return -1;
        }
        char firstNeedle = needle.charAt(0);
        boolean found = false;
        int index = -1;
        for(int i = 0; i < haystack.length(); i++){
            char currentHay = haystack.charAt(i);
            if(currentHay == firstNeedle){
                found = true;
                for(int j = 0; j < needle.length(); j++){
                    boolean inBounds = (i+j) >= 0 && (i+j) < haystack.length();
                    if(inBounds){
                        if(haystack.charAt(i+j) != needle.charAt(j)){
                        found = false;
                        break;
                    }
                    } 
                }
                if(found){
                   index = i;
                   break; 
                }
            }
        }
        return index;*/
    }
