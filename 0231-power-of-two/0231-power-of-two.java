class Solution {
    boolean pow(int n){
        if(n == 1){
            return true;
        }
        if(n <= 0 || n % 2 != 0){
            return false;
        }
        return pow(n/2);
    }

    public boolean isPowerOfTwo(int n) {
        return pow(n);
    }
}