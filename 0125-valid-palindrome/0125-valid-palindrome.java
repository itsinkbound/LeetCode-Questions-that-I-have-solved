class Solution {
    private static boolean recur(int i, String w,int n){
        if(i>=n/2) return true;
        if(w.charAt(i)!=w.charAt(n-i-1)) return false;

        return recur(i+1,w,n);
    }
    public boolean isPalindrome(String s) {
        String w = "";
        for(char c : s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                w+=Character.toLowerCase(c);
            }
        }
        System.out.println(w);
        return recur(0,w,w.length());
    }
}