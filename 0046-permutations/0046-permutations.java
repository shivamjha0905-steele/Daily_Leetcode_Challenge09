class Solution {
    void getPerms(int nums[], int idx, List<List<Integer>> ans){
        int n = nums.length;
        if(idx == n){
            List<Integer> res = new ArrayList<>();
            for(int i = 0; i < n; i++){
                res.add(nums[i]);
            }
            ans.add(res);
            return;
        }
        for(int i = idx; i < n; i++){
            int temp = nums[i];
            nums[i] = nums[idx];
            nums[idx] = temp;

            getPerms(nums, idx+1, ans);

            int temp2 = nums[i];
            nums[i] = nums[idx];
            nums[idx] = temp2;
        }
    }
    public List<List<Integer>> permute(int[] nums) {
      List<List<Integer>> ans = new ArrayList<>();
      getPerms(nums, 0, ans);
      return ans;  
    }
}