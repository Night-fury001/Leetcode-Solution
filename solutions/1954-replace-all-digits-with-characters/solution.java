class Solution {
    public static String replaceDigits(String s) {
        String t = s;
        int i = 1;
        while (i < s.length()) {
            char b = (char) (s.charAt(i - 1) + (s.charAt(i) - '0'));
            t = t.replaceFirst(String.valueOf(s.charAt(i)), String.valueOf(b));
            i += 2;
        }
        return t;
    }
}
