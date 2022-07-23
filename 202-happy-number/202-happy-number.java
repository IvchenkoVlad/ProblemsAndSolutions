class Solution {
    Set<Integer> set = new HashSet<>();
    public boolean isHappy(int n) {
        if(n == 1){
            return true;
        }
        if(!set.contains(n)){
            set.add(n);
        }
        else{
            return false;
        }
        int total = 0;
        while(n>0){
            total += (Math.pow(n%10, 2));
            n=n/10;
        }
        
        //System.out.println(total);
        return isHappy(total);
        
    }
}