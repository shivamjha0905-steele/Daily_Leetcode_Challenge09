class Solution {
    boolean pow(int n){
        if(n == 1){
            return true;
        }
        if(n <= 0 || n % 4 != 0){
            return false;
        }
        return pow(n/4);
    }
    public boolean isPowerOfFour(int n) {
       return pow(n); 
    }
}