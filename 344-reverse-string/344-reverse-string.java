class Solution {
    public void reverseString(char[] s) {
        int len=s.length;
        
        for(int i=len-1,j=0;i>=len/2;i--,j++){
            char temp=s[i];
            s[i]=s[j];
            s[j]= temp;
            
            
            
        }
        
        
        
        
        
         
    }
}