class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> map = new HashMap<>();

        String[] str = s.split(" ");
        if (pattern.length() != str.length)
            return false;
        for (int i = 0; i < pattern.length(); i++) {
            char key = pattern.charAt(i);
            if (map.containsKey(key)) {
                if (!map.get(key).equals(str[i])) {
                    return false;
                }
            }else{
                if (map.containsValue(str[i])) {
                    return false;
                }
            }
            map.put(key, str[i]);
        }
        return true;
    }
}
