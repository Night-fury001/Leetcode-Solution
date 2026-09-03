class Solution {
    public boolean uniformArray(int[] nums1) {
        int x = Integer.MAX_VALUE;
        for (int i : nums1){
            if (i % 2 != 0)
                x = Math.min(x,i);
        }
        if (x == Integer.MAX_VALUE) return true;
        for (int i : nums1){
            if (i % 2 == 0 && i < x ) return false;
        }
        return true;
    }
}
