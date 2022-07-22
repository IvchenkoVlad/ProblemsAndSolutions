class Solution {
    public int getLucky(String s, int k) {
        
        
        StringBuilder str = new StringBuilder();
        for(int i = 0 ; i < s.length(); i++){
            int curr = s.charAt(i);
            str.append(curr-96);
        }
        
        while(k>=1){
            int current = 0;
            for(int i = 0; i < str.length(); i++){
                current+=Integer.valueOf(str.charAt(i))-48;
            }
            str.setLength(0);
            str.append(current);
            k--;
        }
        
        System.out.println(str);
    
        return Integer.parseInt(str.toString());
    }
}