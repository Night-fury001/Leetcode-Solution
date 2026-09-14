class Solution {
    public int longestPalindrome(String s) {
        int[] arr = new int[52];
        for (char c : s.toCharArray()){
            if (c >= 'A' && c <= 'Z') arr[c - 'A']++;
            if (c >='a' && c <= 'z') arr[c - 'a' + 26]++;
        }
        int len = 0;
        boolean odd = false;
        for(int i : arr){
            len += (i /2 ) * 2 ;
            if (i % 2 == 1) odd = true;
        }
        return (odd) ? len + 1 : len;
    }
}
