class Solution {
    public int balancedStringSplit(String s) {
        int l=0,r=0,ans=0;
        for (int i=0;i<s.length();i++){
            if(s.charAt(i)=='R'){
                r++;}
                else
                   {
                        l++;
                    }
                
            
            if(l==r){
                ans++;
            }
        }
        return ans;
    }
}