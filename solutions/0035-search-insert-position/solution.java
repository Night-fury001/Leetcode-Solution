class Solution {
    public int searchInsert(int[] nums, int target) {
        int last = nums.length -1;
        int first = 0;
        int mid = first + (last - first) / 2;
        while (first <= last) {
            mid = first + (last - first) / 2;
            if (nums[mid] < target)
                first = mid+1;
            else if (nums[mid] > target)
                last = mid-1;
            else
                return mid;
        }
            return first;
    }
}
