class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int [] emptySpace =  new int[capacity.length];
        for(int i = 0; i < emptySpace.length; i++){
            emptySpace[i] = capacity[i] - rocks[i];
        }
        Arrays.sort(emptySpace);
        int fullBags = 0;
        System.out.println(Arrays.toString(emptySpace));
        for(int item : emptySpace){
            if(additionalRocks == 0){
                break;
            }
            if(item == 0){
                fullBags++;
                continue;
            }
            else{
                if(additionalRocks >= item){
                    additionalRocks -= item;
                    fullBags++;
                }
            }
        }
        return fullBags;
    }
}