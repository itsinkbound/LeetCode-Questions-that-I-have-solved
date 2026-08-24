class Solution {
    public void setZeroes(int[][] matrix) {
        Set<Integer> iset = new HashSet<>();
        Set<Integer> jset = new HashSet<>();
        int m= matrix.length;
        int n=matrix[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==0){
                    iset.add(i);
                    jset.add(j);
                }
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(iset.contains(i) || jset.contains(j)){
                    matrix[i][j] = 0;
                    System.out.println("okay");
                }
            }
        }
    }
}