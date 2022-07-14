class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> ans =new ArrayList<Integer>();
        for(int i=0;i<=nums.length-1;i++){
            int n=Math.abs(nums[i]);
            if(nums[n-1]>0){
                nums[n-1]=-1*nums[n-1];
            }
        }
        for(int i=0;i<=nums.length-1;i++){
            if(nums[i]>0){
                ans.add(i+1);
            }
        }
        return ans;
        
    }
}