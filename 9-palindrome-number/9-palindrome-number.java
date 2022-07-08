class Solution {
    public boolean isPalindrome(int x) {
        System.out.println(reverse(x));
        return reverse(x) == -1 ? false : true;
    }
    
    public int reverse(int x){
        int actual = x;
        if(x < 0){
            return -1;
        }
        int rev = 0;
        while(x != 0){
            rev = rev*10 + x%10;
            x/=10;
        }
        //System.out.println(rev);
        return actual == rev ? rev : -1;
    }
}