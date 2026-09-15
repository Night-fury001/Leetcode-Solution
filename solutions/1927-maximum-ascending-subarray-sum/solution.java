class Solution {
    public int maxAscendingSum(int[] nums) {
        int pre = 0;
        int max = 0;
        int sum = 0;
        for (int i : nums){
            if (pre>=i) sum = 0;
            sum += i;
            max = Math.max(max,sum);
            pre = i;
        }
        return max;
    }
}
