import java.math.BigInteger;
class Solution {
    public static  int[] plusOne(int[] digits) {
        BigInteger num = BigInteger.ZERO;
        for (int j : digits) {
            num = num.multiply(BigInteger.TEN);
            num = num.add(BigInteger.valueOf(j));
        }
        num= num.add(BigInteger.ONE);
        
        String str = num.toString();
       int[] digit = new int[str.length()];

        for (int i = 0; i < str.length(); i++) {
        digit[i] = str.charAt(i)-'0';
}
        return digit;
    }
}
