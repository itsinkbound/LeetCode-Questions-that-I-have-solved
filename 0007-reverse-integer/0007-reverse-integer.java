class Solution {
    public int reverse(int x) {
        long n = x;
        long rev = 0;
        long digit = 0;

        while (n != 0) {
            digit = n % 10;
            rev = rev * 10 + digit;
            n /= 10;
        }

        // Check for 32-bit signed integer range
        if (rev < Integer.MIN_VALUE || rev > Integer.MAX_VALUE) {
            return 0;
        }

        return (int) rev;
    }
}