class Solution {
    public static  boolean canConstruct(String ransomNote, String magazine) {
        int j=0;
        int k = magazine.length();
        for (int i = 0; i < magazine.length() && j<ransomNote.length(); i++) {
            if (ransomNote.charAt(j)==magazine.charAt(i)) {
                magazine =magazine.replaceFirst(String.valueOf(magazine.charAt(i)), "");
                i=-1;
                j++;
            }
        }
        return ransomNote.length()+magazine.length()==k;
    }
}
