class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        // sliding window approach 
        // best way is to create a hasmap of frequency as we move the window and if a 
        // element matches with what we got in the current element then maybe we can
        // delete from the window till we arrive at the first occurence of the element and thus removing that in the end
        
        HashMap<Integer,Integer> map = new HashMap <>();
        int ans = 0;
        int i=0;
        for(int j=0;j<nums.length;j++){
            map.put(nums[j],map.getOrDefault(nums[j],0)+1);
            if(map.get(nums[j])>k){
                while(nums[i]!=nums[j]){
                    map.put(nums[i],map.get(nums[i])-1);
                    i++;

                }
                map.put(nums[i],map.get(nums[i])-1);
                i++;
            }
            ans = Math.max(ans,j-i+1);
        }
        return ans;
    }
}