class Solution {
    public int totalFruit(int[] fruits) {
        
        HashMap<Integer,Integer> garden =new HashMap<>();
        int i =0, j = 0, max = 1;
        
        while(j<fruits.length ){
           
            if(garden.containsKey(fruits[j])){
                int f=garden.get(fruits[j]);
                f++;
                garden.put(fruits[j],f);
            }
            else{
                garden.put(fruits[j],1);
            }
            
            if(garden.size()<2){
                max=Math.max(max,j-i+1);
            }
            else if(garden.size()==2){
                max=Math.max(max,j-i+1);
            }
            
            else if(garden.size()>2){
                while(garden.size()>2 && i<fruits.length){
                    int f=garden.get(fruits[i]);
                    f--;
                    garden.put(fruits[i],f);
                    if(f==0){
                        garden.remove(fruits[i]);       
                    }                   
                    i++;
                }                        
            }
            j++;           
        }
        return max;
    }
        
}