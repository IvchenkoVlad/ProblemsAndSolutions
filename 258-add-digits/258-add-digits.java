class Solution {
    public int addDigits(int num) {
        if(num<10){
            return num;
        }
        int sum=0;
        while(num>0){
            sum+=num%10;//8
            num=num/10; //3
        }
        
        System.out.println(sum);        
        
        //23 2+3     23%10=3 23/10=2

        //453 23%10=3 /10 45 45%10=5 45/10 = 4
        
        return addDigits(sum);
    }
}