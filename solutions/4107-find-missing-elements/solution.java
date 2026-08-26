class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> mis = new ArrayList<>();
        Arrays.sort(nums);
        
        int last = nums.length - 1;
        int count = 0;
        for( int first = nums[0]; first <= nums[last]; first++){
         if (nums[count] == first){
            count++;
         }else{
            mis.add(first);
         }
        }
        return mis;
    }
}
