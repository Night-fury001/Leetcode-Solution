class Solution {
    public int countKeyChanges(String s) {
        String st = s.toLowerCase();
        int count = 0;
        if (s.length() <= 1)
            return count;
        for (int i = 1; i < st.length(); i++) {
            if (st.charAt(i) != st.charAt(i - 1))
                count++;
        }
        return count;
    }
}
