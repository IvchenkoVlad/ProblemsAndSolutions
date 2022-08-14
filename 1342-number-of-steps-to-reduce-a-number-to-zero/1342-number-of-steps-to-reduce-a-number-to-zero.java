class Solution {
    public int numberOfSteps(int num) {
        int total = 0;
        while(num != 0){
            if(num % 2 == 0){
                total++;
                num /= 2;
                continue;
            }
            if(num%2 != 0){
                num--;
                total++;
            }
        }
        return total;
    }
}