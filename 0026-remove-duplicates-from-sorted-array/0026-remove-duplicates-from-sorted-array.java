class Solution {
    public int removeDuplicates(int[] nums) {
        //brute approach could be used by applying sets for the given question 
        // optimal approach is that you find the first differing element and place it in front
        if(nums.length==0) return 0;

        int i=0;
        for(int j=1;j<nums.length;j++){
            if(nums[i]!=nums[j]){
                i++;
                nums[i] = nums[j];
            }
        }

        return i+1;
    }
}