class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int emp = 0;
        for (int i : hours){
            if(i >= target) emp++;
        }
        return emp;
    }
}
