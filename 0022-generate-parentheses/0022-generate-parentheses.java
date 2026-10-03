class Solution {
    public List<String> generateParenthesis(int n) {
        ArrayList <String> ans= new ArrayList<>();
        StringBuilder cur = new StringBuilder();
        genrate(n,n,cur,ans);
        return ans;
    }
    public void genrate(int open,int close,StringBuilder cur,List<String> ans){
        if(close == 0 && open == 0){
            ans.add(cur.toString());
            return;
        }
        if(open > 0){
            cur.append('(');
            genrate(open -1,close,cur,ans);
            cur.deleteCharAt(cur.length() - 1);
        }
        if(close > open){
            cur.append(')');
            genrate(open ,close-1,cur,ans);
            cur.deleteCharAt(cur.length() - 1);
        }
    }
}