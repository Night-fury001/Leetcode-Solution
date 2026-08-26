class Solution {
   public static int missingInteger(int[] nums) {

        int sum=nums[0];
        int i;
        if (nums.length==1) {
            return nums[0]+1;
        }
        for ( i = 1; i < nums.length; i++) {
        if(nums[i]==nums[i-1]+1){
            sum+=nums[i];
          }
        else{
            break;
          }
        }

        for ( int k = i-1 ; k <nums.length; k++) {
        
            for ( int j = i-1 ; j <nums.length; j++){
                if(sum==nums[j]){
                    // statment
                    sum=nums[j]+1;
                    k=i;
                    break;
                }
            }
        }
        return sum;
    }
}
