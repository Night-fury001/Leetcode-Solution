class Solution {
    public static boolean isSubsequence(String s, String t) {
        int i = 0, j = 0;
        if (s.length() == 0)
            return true;
        while (i < t.length()) {
            if (s.charAt(j) == t.charAt(i))
                j++;
            i++;
            if (s.length() == j)
                return true;
        }
        return j == s.length();
    }
}
