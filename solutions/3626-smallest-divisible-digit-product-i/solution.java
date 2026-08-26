class Solution {
    public int smallestNumber(int n, int t) {
        while (true) {
            int first = 1;
            if (n / 10 != 0)
                first = n / 10;
            int mul = first * (n%10);
            if (mul % t == 0)
                return n;
            n++;
        }
    }
}
