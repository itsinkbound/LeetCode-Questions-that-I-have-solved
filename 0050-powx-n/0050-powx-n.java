class Solution {
    public double myPow(double x, int num) {
        long bin = num;
        double res = 1;
        if(num<0){
            bin=-bin;
            x=1/x;
        }
        while(bin>0){
            if(bin%2==1){
                res *= x;
            }
            bin/=2;
            x*=x;
        }
        return res;
    }

}