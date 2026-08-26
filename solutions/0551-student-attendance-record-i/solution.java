class Solution {
    public static boolean checkRecord(String s) {
        char L ='L';
        char A ='A';
        int a = 0;
        int l= 0;
        if (s.length()==0) {
            return true;
        }
        for (int i = 0; i <= s.length()-1; i++) {
            if(A==s.charAt(i)) {
                a++;
            }
            if(L==s.charAt(i)){
                l = 0;
                for (int j = 0; j < 3; j++) {
                    if (j+i>s.length()-1) {
                        break;
                    }
                    if(L==s.charAt(i+j)){
                        l++;
                    }
                }
            }
            if (a>=2 || l>=3) {
                return false;
            }
        }
        return true;
    }
}
