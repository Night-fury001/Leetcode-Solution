class Solution {
   public static void reverseString(char[] s) {
        int j = s.length-1;
        for (int i = 0; i < (s.length-1); i++,j--) {
            if (j<=i) {
                break;
            }
                char temp =s[i];
                s[i]=s[j];
                s[j]=temp;
        }  
    }
}
