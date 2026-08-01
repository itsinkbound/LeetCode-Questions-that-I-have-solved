class Solution {
    public boolean check(int[] nums) {
        int i =1;
        if(nums.length <=2) return true;
        while(i<nums.length && nums[i]>=nums[i-1]){
            i++;
        }
        if(i==nums.length){
            return true;
        }
        boolean check1 = nums[0]>=nums[nums.length-1];
        boolean check2 = true;
        i++; //increment to start examining the next increasing part 
        while(i<nums.length){
            if(nums[i]<nums[i-1]){
                check2 = false;
                break;
            }
            i++;
        }
        return check1 && check2;
    }
}
