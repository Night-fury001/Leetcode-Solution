class Solution {
    public int largestAltitude(int[] gain) {
        int hight = 0;
        int max = 0;
        for (int i : gain) {
            hight += i;
            max = Math.max(max,hight);
        }
        return max;
    }
}
