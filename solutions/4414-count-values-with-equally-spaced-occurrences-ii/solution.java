class Solution {
    public int countSpecialIntegers(int[] nums) {

        Map<Integer, List<Integer>> indexMap = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            indexMap.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(i);
        }

        int count = 0;

        for (List<Integer> indices : indexMap.values()) {
            int size = indices.size();
            if (size < 3) continue;

            int gap = indices.get(1) - indices.get(0);
            boolean isValid = true;

            for (int i = 2; i < size; i++) {
                if (indices.get(i) - indices.get(i - 1) != gap) {
                    isValid = false;
                    break;
                }
            }

            if (isValid) {
                count++;
            }
        }

        return count;
    }
}
