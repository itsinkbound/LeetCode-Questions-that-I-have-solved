class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum=0,result=0;
        map.put(0,1);
        for(int x : nums){
            sum+=x;
            int diff = sum-k;
            result+=map.getOrDefault(diff,0);
            map.put(sum,map.getOrDefault(sum,0)+1);
            System.out.println(map.get(diff));
        }
        return result;
    }
}