class Solution {
    public boolean isPalindrome(String s) {
        s=s.replaceAll("[^a-zA-Z0-9]","");
        s=s.toLowerCase();
        String rev="";
        
         
        for(int j=s.length()-1;j>=0;j--){
            rev=rev+s.charAt(j);
        }
            if(s.equals(rev)){return true;}
                    
        
       
            return false;

        
    }
}