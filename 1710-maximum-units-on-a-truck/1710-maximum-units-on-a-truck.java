class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        //find out which type of boxes contains the most items
        Arrays.sort(boxTypes, (a,b)->b[1]-a[1]);
        System.out.println(Arrays.deepToString(boxTypes));
        int totalItem = 0;
        for(int [] eachBox : boxTypes){
            if(truckSize == 0){
                break;
            }
            if(truckSize>eachBox[0]){
                totalItem += (eachBox[0] * eachBox[1]);
                truckSize-=eachBox[0];
            }
            else{
                totalItem += (truckSize * eachBox[1]);
                truckSize-=truckSize;
            }
        }
        return totalItem;
    }
}