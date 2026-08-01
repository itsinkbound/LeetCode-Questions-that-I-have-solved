class Solution {
    public void moveZeroes(int[] nums) {
        int i=0,j=0;
        int n = nums.length;
        if(n==1) return;
        for(int x=0;x<n;x++){
            if(nums[i]==0){
                i=x;
                break;
            }
        }
        if(i==n-1) return;
        while(j<n){
            if(nums[j]==0){
                j++;
            }
            else{
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;i++;
            }
        }
    }
}