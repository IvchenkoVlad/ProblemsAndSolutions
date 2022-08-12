class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        //find out which type of boxes contains the most items
        Arrays.sort(boxTypes, Comparator.comparingInt(item -> item[1]));
        // for(int i = 0; i < boxTypes.length; i++){
        //     for(int j = 0; j < boxTypes[i].length; j++){
        //         System.out.print(boxTypes[i][j] + " ");
        //     }
        //     System.out.println();
        // }
        int boxTotal = 0;
        int itemsTotal = 0;
        for(int i = boxTypes.length-1; i >= 0; i--){
            if(truckSize == 0){
                break;
            }
            boxTotal = boxTypes[i][0];
            if(boxTotal < truckSize){
                itemsTotal += (boxTypes[i][1] * boxTotal);
                truckSize -= boxTotal;
            }
            else{
                while(truckSize > 0){
                    itemsTotal += boxTypes[i][1];
                    truckSize--;
                }
            }
        }
        return itemsTotal;
    }
}