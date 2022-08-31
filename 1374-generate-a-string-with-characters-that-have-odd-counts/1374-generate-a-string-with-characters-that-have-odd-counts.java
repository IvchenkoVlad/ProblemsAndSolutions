class Solution {
    public String generateTheString(int n) {
        StringBuilder sBuilder = new StringBuilder();
        if(n % 2 == 0){
            n = n-1;
            for(int i = 0; i < n; i++){
            sBuilder.append('a');
            }
            sBuilder.append('b');
        }
        else{
           for(int i = 0; i < n; i++){
            sBuilder.append('a');
            } 
        }
        return sBuilder.toString();
    }
}