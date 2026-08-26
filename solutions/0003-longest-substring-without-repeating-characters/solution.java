class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        String str = "";
        int len = 0;
        int max = Integer.MIN_VALUE;
        if(s.length()==0) return 0;
        for(char ch : s.toCharArray()){
            if(set.contains(ch)){
                set.clear();
                int inx = str.indexOf(ch);
                str = str.substring(inx + 1);
                for (char c : str.toCharArray()){
                    set.add(c);
                }
                str = str + ch;
                set.add(ch);
            }else{
                set.add(ch);
                str = str + ch;
            }
            len = set.size();
            max = Math.max(max,len);
        }
        return max;
    }
}
