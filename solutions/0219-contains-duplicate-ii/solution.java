class Solution {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
           Integer pre = map.get(nums[i]);
            if (pre != null && i - pre <= k) {
                    return true;
            } 
            map.put(nums[i], i);
        }
        return false;
    }
}
