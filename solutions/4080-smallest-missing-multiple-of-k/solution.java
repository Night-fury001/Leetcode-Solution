class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer> check = new HashSet<>();
        for (int i : nums) {
            if (i % k == 0) {
                check.add(i / k);
            }
        }
        int i = 1;
        while (check.contains(i)) {
            i++;
        }
        return i* k;
    }
}
