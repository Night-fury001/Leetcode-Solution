class Solution {
    public static int addDigits(int num) {
        // return 1+(n-1)%9;
        int b = 0;
        while (true) {
            b += num % 10;
            num = num / 10;
            if (num == 0) {
                if (b <= 9){
                    return b;
                }
                else{
                    num = b;
                    b = 0;
                }
            }
        }
    }
}
