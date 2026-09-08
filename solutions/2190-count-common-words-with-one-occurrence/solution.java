class Solution {
    public int countWords(String[] words1, String[] words2) {
        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();
        int count = 0;
        for (String st : words1) {
            map1.put(st, map1.getOrDefault(st, 0) + 1);
        }
        for (String st : words2) {
            map2.put(st, map2.getOrDefault(st, 0) + 1);
        }
        for (String st : map1.keySet()) {
            if (map1.get(st) == 1 && map2.getOrDefault(st, 0) == 1) {
                count++;
            }
        }
        return count;
    }
}
