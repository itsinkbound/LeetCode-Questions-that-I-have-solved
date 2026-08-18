class Solution {
    public int largestInteger(int[] nums, int k) {
        TreeMap<Integer,Integer> map = new TreeMap<>(Collections.reverseOrder());
        for(int i : nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int largest = 0;
        if(k==1){
            for(Integer x : map.keySet()){
                if(map.get(x)==1){
                    largest = x;
                    return largest;
                }
            }

        }
        if(k==nums.length){
            for(int x : nums) largest = Math.max(largest,x);
            return largest;
        }
        if(map.get(nums[nums.length-1])==1 && map.get(nums[0])==1) return Math.max(nums[0],nums[nums.length-1]);
        else if(map.get(nums[0])!=1 && map.get(nums[nums.length-1])==1)  return nums[nums.length-1];
        else if(map.get(nums[nums.length-1])!=1  && map.get(nums[0])==1) return nums[0];
        else return -1;
    }
}