class Solution {
    public static String addStrings(String num1, String num2) {
        int carry = 0,rem;
        String str="";
        char B,A;
        int j = num2.length()-1;
        int i = num1.length()-1;
        while ( i >= 0 || j>=0 || carry!=0) {
            if (i>=0) {
                A = num1.charAt(i);                
            }
            else A='0';
            if (j>=0) {
                B = num2.charAt(j);                
            }
            else B='0';
            int a = A - '0';
            int b = B - '0';
            int sum = a + b + carry;
            carry = sum/10;
            rem = sum % 10;
            str = String.valueOf(rem)+str;
            j--;
            i--;
        }
        i=0;
        while (str.charAt(i)=='0' && i<str.length()-1) {
            i++;
        }
        return str.substring(i);
    }
}
