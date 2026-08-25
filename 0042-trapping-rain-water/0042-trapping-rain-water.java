class Solution {
    public int trap(int[] nums) {
        int l=0,r=nums.length-1;
        int lmax=0;int rmax=0;
        int water=0;
        while(l<r){
            if(nums[l]<nums[r]){
                if(nums[l]>=lmax){
                    lmax = nums[l];
                }else{
                    water += (lmax-nums[l]);
                }
                l++;
            }else{
                if(nums[r]>=rmax){
                    rmax=nums[r];
                }else{
                    water+=(rmax-nums[r]);
                }
                r--;
            }
        }
        return water;
    }
}