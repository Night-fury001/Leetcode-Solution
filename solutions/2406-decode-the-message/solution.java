class Solution {
    public String decodeMessage(String key, String message) {
        Map<Character, Character> map = new HashMap<>();
        char alpha = 'a';
        StringBuilder result = new StringBuilder();
        for (char s : key.toCharArray()) {
            if (!map.containsKey(s) && s != ' ') {
                map.put(s, alpha);
                alpha++;
            }
        }
        for (char s : message.toCharArray()){
            if (s == ' ') result.append(' ');
            else result.append(map.get(s));
        }
        return result.toString();
    }
}
