class Solution {
    public int[] twoSum(int[] nums, int target) {
    int[] ar=new int[2];
    int i;
    int j;
    for (i = 0; i < nums.length; i++) {
        for (j = i+1; j < nums.length; j++) {
            if((nums[i]+nums[j])==target){
                ar[0]=i;
                ar[1]=j;
                return ar;
            }
        }
        
    }
    return ar;
} 
}
