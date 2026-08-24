class Solution {
    public int lengthOfLongestSubstring(String s) {
        int ans =0;
        HashSet<Character> set = new HashSet<>();
        int i=0,j=0;
        for ( i = 0; i < s.length(); i++) {
            while (set.contains(s.charAt(i))) {
                set.remove(s.charAt(j));
                j++;
            }
            set.add(s.charAt(i));
            ans = Math.max(ans, set.size());
        }
        return ans;
    }
}