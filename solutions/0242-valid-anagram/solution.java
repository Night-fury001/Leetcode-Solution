class Solution {
    public static boolean isAnagram(String s, String t) {
         char[] arr1 = s.toCharArray();   
        Arrays.sort(arr1);                 
        
        String sorted1 = new String(arr1);  

        char[] arr = t.toCharArray();   
        Arrays.sort(arr);                 
        
        String sorted = new String(arr);
        return sorted.equals(sorted1);
    }
}
