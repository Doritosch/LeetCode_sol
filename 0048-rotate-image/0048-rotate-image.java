class Solution {
    public void rotate(int[][] matrix) {
        int length = matrix.length;
        
        for (int i = 0; i < length / 2; i++) {
            for (int j = i; j < length - i - 1; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[length - j - 1][i];
                matrix[length - j - 1][i] = matrix[length - i - 1][length - j - 1];
                matrix[length - i - 1][length - j - 1] = matrix[j][length - i - 1];
                matrix[j][length - i - 1] = temp;
                
                
                // i,j  0.  0, length-j-1
                // 
                // length-j-1, 
            }
        }
    }
}
