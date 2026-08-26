class Solution {
    public boolean isPalindrome(int x) {
        int length = String.valueOf(x).length();
        int c=x,b=0;
        if (x<0) return false;
        if (length==1) return true;
        for (int i = 0; i < length ; i++) {
            int a=c%10;
            b=b*10+a;
            c=c/10;
        }
        return b==x;
    }
}
