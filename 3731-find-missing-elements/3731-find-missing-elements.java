class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        int i=nums[0],j=nums[nums.length-1];
        TreeSet<Integer> treeSet = new TreeSet<>();
        for (int num : nums) {
            treeSet.add(num); // Java automatically handles boxing here
        }
        List<Integer> list = new ArrayList<>();
        for(int x=i;x<=j;x++){
            if(!treeSet.contains(x)){
                list.add(x);
            }
        }
        return list;

    }
}