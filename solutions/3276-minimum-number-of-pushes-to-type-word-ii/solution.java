class Solution {
    public int minimumPushes(String word) {
        int[] ar = new int[26];
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            ar[(int) ch - 97] += 1;
        }
        int ans = 0;
        int i = 0;
        Arrays.sort(ar);
        for (int j = ar.length - 1; j >= 0; j--, i++) {
            if (ar[j] == 0) break;
            int mul = (i/8) + 1;
            ans += ar[j] * mul;
        }
        return ans;
    }
}
