import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        //brute force will take n2
        //sort the list first and then use binary search to make it nlogn
        //better method use hashmaps to store the numbers with their indices if the remainder is not already present in the hashmap
        //gives O(n) time and space complexity
        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int complement = target-nums[i];
            if(map.containsKey(complement)){
                return new int[] {map.get(complement),i};
            }
            map.put(nums[i],i);
        }
        return new int[] {-1,-1};

    }
}