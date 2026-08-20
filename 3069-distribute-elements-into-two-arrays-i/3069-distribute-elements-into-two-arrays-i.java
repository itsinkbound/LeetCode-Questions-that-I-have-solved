class Solution {
    public int[] resultArray(int[] nums) {
        int n = nums.length;
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        int i=0,j=0;
        arr1[0] = nums[0];
        arr2[0] = nums[1];
        for(int k = 2; k<n;k++){
            if(arr1[i]>arr2[j]){
                arr1[++i] = nums[k];
            }else{
                arr2[++j] = nums[k];
            }
        }
        int id = 0;
        int[] res = new int[n];
        for( int k = 0; k <= i; k++){
            res[id++] = arr1[k];
        }
        for(int k = 0; k <= j; k++){
            res[id++] = arr2[k];
        }
        return res;
    }
}