class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0;i<nums.length-2;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int left = i+1,right = nums.length-1;
            while(left<right){
                int sum = nums[i]+nums[left]+nums[right];
                if(sum==0){
                    ans.add(List.of(nums[i],nums[left],nums[right]));
                    while(left<right && nums[left]==nums[left+1]){
                        left++;
                    }
                    while(left<right && nums[right]==nums[right-1]){
                        right--;
                    }
                    //after the duplicates are removed we must update the pointer to actually check the next triplet
                    //or in case there are no duplicates the left and right still has to update ryt
                    left++;
                    right--;
                }
                else if(sum<0){
                    left++;
                }else{
                    right--;
                }
            }
        }
        return ans;
    }
}