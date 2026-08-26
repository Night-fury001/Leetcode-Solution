class Solution {
    public int mySqrt(int x) {
        int low = 0;
        int high = x ;
        int mid = 0;
        // int ans=0;
        while (low <= high) {
            mid = low + (high-low) / 2;
            long sq = (long)mid * (long)mid;
            if (sq < x){

                low = mid + 1;
            }
            else if (sq > x)
                high = mid - 1;
            else if(sq==x)  return mid;
        }
        return high;
    }
}
