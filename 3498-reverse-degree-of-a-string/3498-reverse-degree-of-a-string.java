class Solution {
    public int reverseDegree(String s) {
        int sum = 0 ,count = 1;
        for ( char st : s.toCharArray()){
            sum += ((123 - st) * (count++));
            // sum += ((123 - st) * ((st - 'a')+1));
        }
        return sum;
    }
}