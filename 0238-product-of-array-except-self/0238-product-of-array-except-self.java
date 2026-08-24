class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int pre=1,post=1;
        Arrays.fill(result,1);
        for(int i=1;i<nums.length;i++){
            result[i] = nums[i-1]*pre;
            pre*=nums[i-1];
        }
        for(int i=nums.length-2;i>=0;i--){
            post *= nums[i+1];
            result[i] *= post;
        }
        return result;
    }

}