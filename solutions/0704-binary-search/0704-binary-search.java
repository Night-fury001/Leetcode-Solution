class Solution {
    public int search(int[] nums, int target) {
        int hi = nums.length - 1;
        return bSearch(nums, target, 0, hi);
    }
    public int bSearch(int[] nums, int target, int lo, int hi){
        if (lo > hi) return -1;
        int mid = lo + ( hi - lo)/2;
        if (nums[mid] == target) return mid;
        else if(nums[mid] > target) return bSearch(nums, target, lo, mid -1);
        else return bSearch(nums, target, mid + 1, hi);
    }
}