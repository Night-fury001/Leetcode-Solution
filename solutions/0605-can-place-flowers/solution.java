class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        // if ((flowerbed.length - 1) < n)
        //     return false;

        int count = 0;
        boolean pre = true;
        boolean next = true;
        for (int i = 0; i < flowerbed.length; i++) {
            if (i + 1 < flowerbed.length)
                next = (flowerbed[i + 1] == 0);
            else
                next = true;
            if (flowerbed[i] == 0 && pre && next) {
                flowerbed[i] = 1;
                count++;
                next = false;
            }
            pre = (flowerbed[i] == 0);
        }
        return n <= count;
    }
}
