class Solution {
    public boolean validDigit(int n, int x) {
        String st = Integer.toString(n);
        char tar = (char) ('0' + x);
        if (st.charAt(0) == tar)
            return false;
        return st.indexOf(tar) != -1;
    }
}
