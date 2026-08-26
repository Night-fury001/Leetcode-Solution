class Solution {
    public static int strStr(String haystack, String needle) {        
        for(int i=0;i<haystack.length();i++) {
            System.out.println("for"+i);
            if ((i+needle.length()) > haystack.length()) {
                return -1;
            }
            if (haystack.substring(i,(i+needle.length())).equals(needle)){
                return i;
            }
            
        
        }
        return -1;
    }
}
