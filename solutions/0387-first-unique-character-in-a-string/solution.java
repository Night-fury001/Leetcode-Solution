class Solution {
    public static int firstUniqChar(String s) {
        for (int i = 0; i < s.length(); i++) {
            int count=0;
            for (int j = 0; j < s.length(); j++) {
                if (i==j) {
                    continue;
                }
                if (s.charAt(i)==s.charAt(j)) {
                    count=0;
                    break;
                }
                count++;
            }
            if (count==s.length()-1) {
                return i;
            }
        }
        return-1;
    }
}
