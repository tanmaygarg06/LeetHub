class Solution {
    public int scoreOfParentheses(String s) {
        int c=0;      
        int l=0;      
        char prev=' ';
        for(char ch:s.toCharArray()){
            if(ch=='('){
                l++;
            }
            else{
                l--;
                if(prev=='('){
                    c=c+(int)Math.pow(2,l);
                }
            }
            prev=ch;
        }
        return c;
    }
}