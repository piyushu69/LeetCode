class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i=0,j=0,z=0,a=0;
        for( i=0;i<nums.length;i++)
        {
          for( j=i+1;j<nums.length;j++)
          {
              if(nums[i]+nums[j]==target){
                 z=i;
                  a=j;
                  break;
                 
              }
            
          }
            
        }
           return new int[]{z,a}; 
    } 

}