class Solution {
    public void setZeroes(int[][] matrix) {
        int m= matrix.length;
        int n=matrix[0].length;
        int space = 1;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==0){
                    matrix[0][j]=0;
                    if(i==0){
                        space=0;
                    }else{
                        matrix[i][0]=0;
                    }
                }
            }
        }
        // creates the in memory check sets 
        // now to transform the matrix
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(matrix[i][0]==0 || matrix[0][j]==0){
                    matrix[i][j] = 0;
                }
            }
        }
        if(matrix[0][0]==0){
            for(int i=0;i<m;i++) matrix[i][0]=0;
        }
        if(space==0){
            for(int i=0;i<n;i++) matrix[0][i]=0;
        }
    }
}