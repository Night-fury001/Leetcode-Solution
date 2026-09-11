class Solution {
    public int getLucky(String s, int k) {
        int num = 0;
        for (int i = 0; i < s.length(); i++) {
            int temp = s.charAt(i) - 'a' + 1;
            num += (temp / 10) + (temp % 10);
        }
        while (--k > 0) {
            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            num = sum;
        }
        return num;
    }
}
