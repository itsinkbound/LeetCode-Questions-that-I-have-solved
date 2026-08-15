class Solution {
    public int longestSubsequence(int[] nums) {
        int res = 0,xor=0;
        boolean notZero = false;
        for(int x:nums){
            xor^=x;
            if(x!=0) notZero = true;
        }
        res = nums.length;
        if(xor!=0) return res;
        else if(notZero) return res-1;
        return 0;
    }
}