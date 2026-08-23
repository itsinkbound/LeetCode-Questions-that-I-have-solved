class Solution {
    public int majorityElement(int[] nums) {
        int el = 0, n = nums.length,cnt =0;
        for(int i=0;i<n;i++){
            if(cnt==0) el = nums[i];
            if(nums[i]==el) {
                cnt++;
            }
            else{
                cnt--;
            }
        }
        return el;
    }
}