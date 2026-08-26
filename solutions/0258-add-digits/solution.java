class Solution {
    public static int addDigits(int num) {
        int b = 0;
        while (true) {
            int a = num % 10;
            num = num / 10;
            b += a;
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
