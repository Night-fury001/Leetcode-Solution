class Solution {
    public int minElement(int[] nums) {
        int min = Integer.MAX_VALUE;
        for (int n : nums){
            int num = n;
            int temp = 0;
            while (num != 0){
                temp += num % 10;
                num /= 10;
            }
            min = Math.min(min,temp);
        }
        return min;
    }
}
