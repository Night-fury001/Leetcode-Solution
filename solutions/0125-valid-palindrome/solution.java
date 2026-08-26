class Solution {
    public static boolean isPalindrome(String s) {
        String res = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        int j = res.length()-1,i=0;
        while (i<j) {
            if (res.charAt(i)!=res.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
