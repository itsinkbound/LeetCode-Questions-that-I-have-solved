class Solution {
    public int removeElement(int[] nums, int val) {
        // List<Integer> list = new ArrayList<>();
        // for(int num : nums){
        //     if(num!=val) list.add(num);
        // }
        // for(int i=0;i<list.size();i++){
        //     nums[i]=list.get(i);
        // }
        // return list.size();


        // int i=0,n=nums.length;
        // while(i<n){
        //     if(nums[i]==val){
        //         nums[i]=nums[--n];
        //     }
        //     else{
        //         i++;
        //     }
        // }
        // return n;

        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[j++]=nums[i];
            }
        }
        return j;
    }
}