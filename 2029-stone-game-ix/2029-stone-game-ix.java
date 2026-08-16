class Solution {
    public boolean stoneGameIX(int[] stones) {
        int[] count = new int[3];
        for (int stone : stones) {
            count[stone % 3]++;
        }
        
        int c0 = count[0];
        int c1 = count[1];
        int c2 = count[2];
        
        // Even count of 0s: Alice wins if she can force Bob into a lose state.
        // Needs at least one non-zero remainder to start and min(c1, c2) >= 1.
        if (c0 % 2 == 0) {
            return c1 >= 1 && c2 >= 1;
        }
        
        // Odd count of 0s: The extra 0 flips the advantage.
        // Alice wins if the difference between c1 and c2 is 3 or more.
        return Math.abs(c1 - c2) > 2;
    }
}