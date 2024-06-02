import java.util.*;
class Solution {
    public void setZeroes(int[][] matrix) {
        ArrayList<Integer> zero_x = new ArrayList<Integer>();
        ArrayList<Integer> zero_y = new ArrayList<Integer>();
        
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j]==0){
                    zero_x.add(i);
                    zero_y.add(j);
                }
            }
        }

        for(int i=0; i<zero_x.size(); i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[zero_x.get(i)][j]!=0) matrix[zero_x.get(i)][j]=0;
            }
        }
        for(int i=0; i<zero_y.size(); i++){
            for(int j=0; j<matrix.length; j++){
                if(matrix[j][zero_y.get(i)]!=0) matrix[j][zero_y.get(i)]=0;
            }
        }
    }
}