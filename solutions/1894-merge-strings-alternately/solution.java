class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i = 0;
        int j = 0;
        int k = 0;
        String str = "";
        while (i <= word1.length() - 1 && j <= word2.length() - 1){
            if(k % 2 == 0){
                str += word1.charAt(i++);
            }else{
                str +=  word2.charAt(j++);
            }
            k++;
        }
        while(i <=  word1.length() - 1){
            str += word1.charAt(i++);
        }
        while(j <=  word2.length() - 1){
            str += word2.charAt(j++);
        }
        return str;
    }
}
