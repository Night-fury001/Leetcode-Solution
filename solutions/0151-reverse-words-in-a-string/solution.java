class Solution {
    public String reverseWords(String s) {
        // String[] str = s.trim().split("\\s+");
        // StringBuilder res = new StringBuilder();
        // for(int i = str.length - 1; i >= 0; i-- ){
        //     res.append(str[i]);
        //     if (i !=0) res.append(" ");
        // }
        // return res.toString();

        StringBuilder st = new StringBuilder();
        s = s.trim();
        int j = s.length();
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ')
                continue;
            if (i + 1 < j)
                st.append(s.substring(i + 1, j)).append(" ");
            j = i;
        }
        st.append(s.substring(0, j));
        return st.toString();
    }
}
