class Solution {
    private int[] piles;
    private int n;
    private int[] prefixSum;
    private int[][] memo;
    public int stoneGameII(int[] piles) {
        this.piles = piles;
        this.n = piles.length;
        this.prefixSum = new int[n+1];
        this.memo = new int[n][n+1];
        for(int i=0;i<n;i++){
            prefixSum[i+1] = prefixSum[i]+piles[i];
        }
        return findMaxStones(0,1);
    }
    private int findMaxStones(int i, int M){
        if(i>=n) return 0;
        if(memo[i][M]!=0){
            return memo[i][M];
        }
        int maxStones = 0;
        for(int x=1;x<=2*M && i+x<=n;x++){
            int currentStones = prefixSum[i+x]-prefixSum[i];
            int totalStonesRemaining = prefixSum[n] - prefixSum[i+x];
            int nextStones = findMaxStones( i+x,Math.max(M,x));
            maxStones = Math.max(maxStones,currentStones+totalStonesRemaining - nextStones);
        }
        memo[i][M] = maxStones;
        return maxStones;
    }
}
