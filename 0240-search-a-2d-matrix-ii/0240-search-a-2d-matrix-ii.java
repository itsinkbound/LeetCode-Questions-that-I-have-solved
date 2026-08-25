class Solution {
    static boolean binSearch(int[] mat, int target){
        int l = 0, r = mat.length-1;
        while(l<=r){
            int mid = l+(r-l)/2;
            if(mat[mid]==target){
                return true;
            }
            else if(target>mat[mid]){
                l=mid+1;
            }else{
                r=mid-1;
            }
        }
        return false;
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        for(int i=0;i<m;i++){
            if(matrix[i][0]<=target){
                boolean res = binSearch(matrix[i],target);
                if(res) return res;
            }else{
                break;
            }
        }
        return false;
    }
}