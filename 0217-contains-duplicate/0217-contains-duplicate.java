class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> setnum = new HashSet<>();
        for(int num:nums){
            if(setnum.contains(num)){
                return true;
            }
            setnum.add(num);
        }
        return false;
    }
}