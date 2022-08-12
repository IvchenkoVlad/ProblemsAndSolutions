class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        //find out which type of boxes contains the most items
        Arrays.sort(boxTypes, (a,b)->b[1]-a[1]);
        System.out.println(Arrays.deepToString(boxTypes));
        int totalItems = 0;
        for(int [] eachBox : boxTypes){
            if (truckSize >= eachBox[0]) {
                totalItems += eachBox[0] * eachBox[1];
                truckSize -= eachBox[0];
            }else {
                totalItems += truckSize * eachBox[1];
                break;
            }
        }
        return totalItems;
    }
}