class Solution {
    public long getDescentPeriods(int[] prices) {
        int n = prices.length;
        long cnt = 1;
        long ans = 1;
    for(int i = 1; i < n; i++){
        if((prices[i-1]) - prices[i] == 1){
            cnt++;
        }
        else{
            cnt = 1;
        }
        ans+= cnt;
    }
    return ans;
    }
}