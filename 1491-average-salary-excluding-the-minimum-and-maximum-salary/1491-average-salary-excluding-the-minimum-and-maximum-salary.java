class Solution {
    public double average(int[] salary) {
        
        int minSalary = Integer.MAX_VALUE;
        int maxSalary = Integer.MIN_VALUE;
        double sum = 0;
        
        for(int i = 0; i < salary.length; i++){
            if(salary[i] < minSalary){
                minSalary = salary[i];
            }
            if(salary[i] > maxSalary){
                maxSalary = salary[i];
            }
            sum += salary[i];
        }
        
        return (double) ((sum - minSalary - maxSalary)/(salary.length-2));
        
    }
}