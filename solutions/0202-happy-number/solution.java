class Solution {
    public static boolean isHappy(int n) {
        int b=0;
        while (true) { 
            int a = n%10;
            b+=(a*a);
            n/=10;
            if(n==0){
                if(b==1) return true;
                if(b==4) return false;
                n=b;
                b=0;
            }
        }
    }
}
