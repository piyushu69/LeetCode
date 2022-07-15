class Solution {
    public String interpret(String command) {
        String ans="";
        for(int i=0;i<command.length();){
            if(command.charAt(i)=='G'){
                ans+="G";
                i++;
            }
            else if(command.substring(i,i+2).equals("()")){
                ans+="o";
                i+=2;
            }
            else{
                ans+="al";
                i+=4;
            }
        }
        return ans;
        
        
    }
}