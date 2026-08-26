class Solution {
    public static String longestCommonPrefix(String[] strs) {
        String result = "";
        for (int j = 0; j < strs[0].length(); j++) {
            char c = strs[0].charAt(j);
            for (String str : strs) {
                if (j>=str.length() ||  str.charAt(j) != c) {
                    return result;
                }
            }
            result += c;
        }
        return result;
    }
}
