class Solution {
    public int maximumWealth(int[][] accounts) {
        int maximumM = 0;
        for(int [] acc : accounts){
            int currentSum = 0;
            for(int money : acc){
                currentSum += money;
            }
            maximumM = Math.max(currentSum, maximumM);
        }
        return maximumM;
    }
}