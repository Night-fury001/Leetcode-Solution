class Solution {
    public int maxDepth(String s) {

        int max = 0;
        int size = 0;
        for(char ch : s.toCharArray()){
            if(ch == '('){
                size++;
                max = Math.max(size,max);
            }else if(ch == ')'){
                size--;
            }
        }
        return max;
    }
}