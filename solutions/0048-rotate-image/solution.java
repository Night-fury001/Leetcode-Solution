class Solution {
    public static void rotate(int[][] matrix){
        int n=matrix.length;    
        for (int i = 0; i <n; i++) {
             for (int j =0; j <=i; j++) {
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }  
        }
        int j  = n-1;
        for (int i = 0; i < j; i++,j--) {
             for (int k =0; k <n; k++) {
                int temp=matrix[k][i];
                matrix[k][i]=matrix[k][j];
                matrix[k][j]=temp;
            }  
        }
        
    }
}
