class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
       
        int[] res=new int[nums.length];
        
        for(int i=0;i<nums.length;i++){
            int c=0;
            for(int j=0;j<nums.length;j++){
                if(nums[i]>nums[j]){
                    c++;
                   
                }
                 
            }
            for(int k=0;k<res.length;k++){
                res[i]=c;
            }
        }
        return res;
        
        
    }
}