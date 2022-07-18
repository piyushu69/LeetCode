class Solution {
    public double average(int[] salary) {
        int len=salary.length;
        int max=-1100000;
        int min=100000000;
        
        
        for(int i=0;i<salary.length;i++){
            max=Math.max(salary[i],max);
            min=Math.min(salary[i],min);
            
        }
        double sum=0;
        for(int i=0;i<salary.length;i++){
            if(salary[i]!=max && salary[i]!=min){
                sum+=salary[i];
            }
        }
        
        
        return sum/(len-2);
        
        
    }
}