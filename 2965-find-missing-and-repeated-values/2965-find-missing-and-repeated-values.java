class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length,sum=0;
        int[] res = new int[2];
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(!set.contains(grid[i][j])){
                    set.add(grid[i][j]);
                    sum+=grid[i][j];
                }
                else{
                    res[0] = grid[i][j];
                }
            }
        }

        int expSum = n*n * (n*n+1) / 2;
        res[1] = expSum - sum;
        return res;

    }
}