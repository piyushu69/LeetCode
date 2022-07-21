class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        
        ArrayList<Integer> ans=new ArrayList<>();
        String s="123456789";
        for(int i=1;i<=9;i++){
            for(int j=0;i+j<=s.length();j++){
                String sub= s.substring(j,i+j);
                int value=Integer.parseInt(sub);
                if(value>=low && value<=high ){
                    ans.add(value);
                }
            }
        }
        return ans;
    }
}