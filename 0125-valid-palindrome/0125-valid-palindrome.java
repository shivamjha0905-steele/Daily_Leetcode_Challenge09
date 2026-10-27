class Solution {
    boolean palindrome(String s, int st, int end){
     if(st >= end){
        return true;
     }
     if(s.charAt(st) != s.charAt(end)){
        return false;
     }
     return palindrome(s, st+1, end-1);
    }
    public boolean isPalindrome(String s) {
       s = s.toLowerCase();
        s = s.replaceAll("[^A-Za-z0-9]", "");
        return palindrome(s, 0, s.length()-1);
    }
}