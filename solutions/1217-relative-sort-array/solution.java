class Solution {
    public static int[] relativeSortArray(int[] arr1, int[] arr2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        //count the number
        for (int i : arr1) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        //store arr2 in arr1
        int n = 0;
        for (int i : arr2) {
            int count = map.get(i);
            while (count-- > 0) {
                arr1[n++] = i;
            }
            map.remove(i);
        }
        //remaning element not persent in arr2
        ArrayList<Integer> rem = new ArrayList<>();
        for (int i : map.keySet()) {
            rem.add(i);
        }
       Collections.sort(rem);
        //store in arr1
        for (int i : rem) {
            int count = map.get(i);
            while (count-- > 0) {
                arr1[n++] = i;
            }
        }

        return arr1;
    }
}
