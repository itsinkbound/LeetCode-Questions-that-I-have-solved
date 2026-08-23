class Solution {
    private static int[] calc(int n){
        int sum = 0,prod=1;
        while(n!=0){
            int ld = n%10;
            sum+=ld;prod*=ld;
            n/=10;
        }
        return (new int[]{sum,prod});
    }
    public boolean checkDivisibility(int n) {
        int[] res = new int[2];
        res = calc(n);
        int sum = res[0]+res[1];
        return n%sum==0;
    }
}