class Solution {
    public int mirrorDistance(int n) {
        int length = String.valueOf(n).length();
        int c=n,b=0;
        for (int i = 0; i < length ; i++) {
            int a=c%10;
            b=b*10+a;
            c=c/10;
        }
        int fin = n-b;
        if (fin < 0) {
            fin = -fin;
        }
        return fin;
    }
}
