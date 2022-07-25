class Solution {
    public int climbStairs(int n) {
        // step #1 -> 1
        // step #2 -> 2
        int step1 = 1, step2 = 2, step3 = step1+step2;
        if(n == 1){
            return step1;
        }
        else if(n == 2){
            return step2;
        }
        else if(n == 3){
            return step3;
        }
        int counter = 3;
        while(counter < n){
            counter ++;
            step1=step2;
            step2=step3;
            step3=step1+step2;
            System.out.println("step " + counter + " -> "+ step3);
        }
        return step3;
        }
}