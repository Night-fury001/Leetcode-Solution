class Solution {
    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int sums = 0;
        int sum = (n * (n + 1)) / 2;
        for (int i : nums) {
            sums += i;
        }
        return sum - sums;
    }
}
