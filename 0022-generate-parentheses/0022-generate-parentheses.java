class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> r=new ArrayList<>();
        List<String> temp=new ArrayList<>();
        return help(n,0,0,temp,r);
    }
    public List<String> help(int n,int o,int c,List<String>temp,List<String>res){
        if(n==o&&n==c){
            res.add(String.join("", temp));
        }
        if(o<n){
            temp.add("(");
            help(n,o+1,c,temp,res);
            temp.remove(temp.size()-1);
        }
        if(c<o){
            temp.add(")");
            help(n,o,c+1,temp,res);
            temp.remove(temp.size()-1);
        }
        return res;
    }
}