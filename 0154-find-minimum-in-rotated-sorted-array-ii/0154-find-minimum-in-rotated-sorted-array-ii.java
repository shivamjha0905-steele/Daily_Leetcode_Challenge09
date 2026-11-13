class Solution {
    public int findMin(int[] nums) {
         int min = Integer.MAX_VALUE;
        Set<Integer> res = new HashSet<>();
         for(int num : nums){
            res.add(num);
        }
        for(int num : res){
           min = Math.min(min , num);
        }
        return min;
    }
}