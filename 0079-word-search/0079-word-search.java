class Solution {
    private static boolean recur(char[][] matrix, int i, int j, int index, String word){
        if(index==word.length()) return true;
        if(i<0 || j<0 || i==matrix.length || j==matrix[0].length) return false;
        if(matrix[i][j]=='#') return false;
        if(word.charAt(index)==matrix[i][j]){
            char ch = matrix[i][j];
            matrix[i][j] = '#';
            boolean a = recur(matrix,i,j+1,index+1,word);
            boolean b = recur(matrix,i+1,j,index+1,word);
            boolean c = recur(matrix,i-1,j,index+1,word);
            boolean d = recur(matrix,i,j-1,index+1,word);
            matrix[i][j]=ch;
            return (a||b||c||d);
        }else{
            return false;
        }

    }
    public boolean exist(char[][] matrix, String word) {
        // if(word.length== && matrix[0][0]==word.toCharArray())) return true;
        List<int[]> loc = new ArrayList<>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j] == word.charAt(0)){
                    loc.add(new int[]{i,j});
                }
            }
        }
        for(int[] x : loc){
            boolean res = recur(matrix, x[0],x[1],0,word);
            if(res) return res;
        }
        return false;
    }
}