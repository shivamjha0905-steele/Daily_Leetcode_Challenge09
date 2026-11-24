class Solution {
    public long zeroFilledSubarray(int[] nums) {
       long cnt = 0; 
       int n = nums.length;
       int j = 0;
       for(int i = 0; i < n; i++){
        if(nums[i] == 0){
            cnt += (i - j + 1);
            }
            else{
                j = i + 1;
            }
        }
       return cnt;
    }
}