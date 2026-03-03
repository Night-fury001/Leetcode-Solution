class Solution {
    public static int singleNumber(int[] nums) {
        int i=0,k=0;
        while (i<nums.length) {
            for (int j = 0; j < nums.length; j++) {
                if (i==j) continue;
                if (nums[i]==nums[j]) {
                    k=0;
                    break;
                }
                k++;
            }
            if (k==nums.length-1) {
                return nums[i];
            }
            i++;
        }
        
        return 0;
    }
}
