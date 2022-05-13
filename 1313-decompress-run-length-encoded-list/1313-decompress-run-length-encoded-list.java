class Solution {
    public int[] decompressRLElist(int[] nums) {
        List<Integer> l=new ArrayList<>();
        
        
        
   
        for(int i=0;i<nums.length;i+=2){
            int freq=nums[i];
                int val=nums[i+1];
            
            for(int j=0;j<freq;j++)
            {
                l.add(val);
            }            
        }
        int [] res=new int [l.size()];
        for(int i=0;i<l.size();i++){
           res[i]=l.get(i);
            
        }
        
        return res;
    }
}