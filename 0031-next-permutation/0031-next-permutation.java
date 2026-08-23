class Solution {
    void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    void reverse(int[] nums, int l, int r){
        while(l<r){
            swap(nums,l,r);
            l++;
            r--;
        }
    }
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        if(n==1) return;
        int pivot=n-2;
        while( pivot>=0 && nums[pivot]>=nums[pivot+1]){
            pivot--;
        }
        if(pivot==-1){
            reverse(nums,0,n-1);
            return;
        }
        int right = n-1;
        while(nums[right]<=nums[pivot]){
            right--;
        }
        swap(nums,pivot,right);
        reverse(nums,pivot+1,n-1);

    }
}