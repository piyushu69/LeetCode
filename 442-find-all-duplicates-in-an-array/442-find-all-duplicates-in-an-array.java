class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> ans= new ArrayList<Integer>();
        for(int i=0;i<=nums.length-1;i++){
            int n=Math.abs(nums[i]);
            if(nums[n-1]<0){
                ans.add(n);
            }
            else{
                nums[n-1]=nums[n-1]*-1;
            }
            
        }
            
       return ans; 
        
    }
}