class Solution {
    public int[] decrypt(int[] code, int k) {
        int n = code.length;
        int[] res = new int[n];

        if (k==0) {
            return res;
        }

        for (int i = 0; i< n; i++){

            int id = k;
            while (id != 0){
                res[i] += code[((i + n) + id) % n];
                id = (id < 0) ? id + 1 : id - 1;
            }
            
        }
        return res;
    }
}
