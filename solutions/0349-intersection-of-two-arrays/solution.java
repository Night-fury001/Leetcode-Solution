class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
    Set<Integer> arr = new HashSet<>();
    Set<Integer> result = new HashSet<>();
    for (int i : nums1) {
        arr.add(i);
    }
    for (int j : nums2) {
        if (arr.contains(j))
            result.add(j);
    }
    int i = 0;
    int[] res = new int[result.size()];
    for(int num : result)
        res[i++] = num;
    return res;
    }
}
