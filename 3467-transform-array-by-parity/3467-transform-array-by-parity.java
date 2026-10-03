class Solution {
    public int[] transformArray(int[] nums) {
        int count = 0;
        for (int i : nums) {
            if (i % 2 == 0) {
                count++;
            }
        }
        int i = 0;
        while (i < count)
            nums[i++] = 0;
        while (i < nums.length)
            nums[i++] = 1;
        return  nums;
    }
}