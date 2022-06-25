class Solution {
    public int totalMoney(int n) {
        int day = 1;
        int week = 0;
        int total = 0;
        for(int i = 1; i < n + 1; i++){
            //System.out.println(i);
            
            total = total + week+day;
            System.out.println(week+day);
            day++;
            if(i / 7 > 0 && i % 7 == 0){
                week++;
                day = 1;
            }
            
        }
        return total;
    }
}