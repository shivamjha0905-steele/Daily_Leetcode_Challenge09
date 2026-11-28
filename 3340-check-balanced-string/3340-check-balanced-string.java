class Solution {
    public boolean isBalanced(String num) {
        int n = num.length();
        int osum = 0;
        int esum = 0;
        for(int i = 0; i < n; i++){
            int d = num.charAt(i) - '0';
            if(i % 2 == 0){
                esum += d;
            }
            else{
                osum += d;
            }
        }
        return esum == osum;
    }
}