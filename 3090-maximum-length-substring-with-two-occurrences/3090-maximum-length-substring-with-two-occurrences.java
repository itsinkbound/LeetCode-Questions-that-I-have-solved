class Solution {
    public int maximumLengthSubstring(String s) {
        int ans =0;
        int[] count = new int[26]; // Fixed size array is faster than HashMap for lowercase English letters
        int j = 0;

        for (int i = 0; i < s.length(); i++) {
            char rightChar = s.charAt(i);
            count[rightChar - 'a']++;

            // Shrink window until the current character's count is at most 2
            while (count[rightChar - 'a'] > 2) {
                char leftChar = s.charAt(j);
                count[leftChar - 'a']--;
                j++;
            }

            ans = Math.max(ans, i - j + 1);
        }
        return ans;
        
    }
}