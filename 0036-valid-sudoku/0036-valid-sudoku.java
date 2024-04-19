class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0; i<9; i++){
            for(int j=0; j<board[i].length-1; j++){
                for(int k=j+1; k<board[i].length; k++){
                    if(board[i][j] != '.' && board[i][j] == board[i][k]){
                        return false;
                    }
                }
            }
        }
        for(int i=0; i<9; i++){
            for(int j=0; j<board[i].length-1; j++){
                for(int k=j+1; k<board[i].length; k++){
                    if(board[j][i] != '.' && board[j][i] == board[k][i]){
                        return false;
                    }
                }
            }
        }
        
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                int[] tempFrequency = new int[9];
                for(int n=0; n<3; n++){
                    for(int m=0; m<3; m++){
                        char boardValue = board[i*3+n][j*3+m];
                        if(boardValue != '.'){
                            tempFrequency[Character.getNumericValue(boardValue)-1]++;
                            for(int q=0; q<tempFrequency.length; q++){
                                if(tempFrequency[q]>1){
                                    return false;
                                }
                            }
                        }
                    }
                }
            }
        }
        return true;
    }
}