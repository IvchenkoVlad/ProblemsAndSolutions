class Solution {
    public int tribonacci(int n) {
        int n1=0, n2 =1, n3 = 1;
        int n4 = n1+n2+n3;
        if(n<1){
            return 0;
        }else if(n<3){
            return 1;
        }
        int counter = 3;
        while(counter < n){
            counter++;
            n1=n2;
            n2=n3;
            n3=n4;
            n4=n1+n2+n3;
        }
        return n4;
    }
}