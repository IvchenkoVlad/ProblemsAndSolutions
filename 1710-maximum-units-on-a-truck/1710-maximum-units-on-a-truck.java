class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        //find out which type of boxes contains the most items
        Arrays.sort(boxTypes, (a,b)->b[1]-a[1]);
        System.out.println(Arrays.deepToString(boxTypes));
        int totalItems = 0;
        for(int [] eachBox : boxTypes){
            if(truckSize == 0){
                break;
            }
            
            int boxCount = Math.min(eachBox[0], truckSize);
            totalItems += (boxCount*eachBox[1]);
            truckSize-=boxCount;
        }
        return totalItems;
    }
}