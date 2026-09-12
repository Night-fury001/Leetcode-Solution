class Solution {
    public int countSpecialIntegers(int[] nums) {
        
        Map <Integer,Integer> map = new HashMap<>();
        for (int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        
        List<Integer> result = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 3) {
                result.add(entry.getKey());
            }
        }

        int count = 0;
        for(int ind : result){
            int i1 = -1,i2 = -1,i3 = -1;
            for(int i =0; i< nums.length;i++){
                if (nums[i] == ind){
                    i1 = i2;
                    i2 = i3;
                    i3 = i;
                }
            }
            if (i2 - i1 == i3 -i2){
                count++;
            }
        }
        return count;
    }
}
