class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int e) {
        int s=candies.length;
        List<Boolean> b = new ArrayList<>();
        
        int n=-1;
        
        
        for(int  i=0;i<candies.length;i++){
            n=Math.max(candies[i],n);
        }
        System.out.println(n);
        
        
        for(int i=0;i<candies.length;i++){
            if((candies[i]+e)>=n)
            { b.add(true);
        }
        else{b.add(false);
            }
        }
        return b;
        
            
      
        
    }
    
}