class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
      Arrays.sort(arr2);
      int count = 0;
      for(int x : arr1){
      int st = 0;
      int end = arr2.length - 1;
      while(st <= end){
        int mid = st + (end - st)/2;
      if(arr2[mid] < x){
        st = mid + 1;
      }
      else{
        end = mid - 1;
      }
      }
      boolean valid = true;

      if(st < arr2.length && Math.abs(arr2[st] - x) <= d){
        valid = false;
      }
      if(st - 1 >= 0 && Math.abs(arr2[st - 1] - x) <= d){
        valid = false;
      }
      if(valid){
        count++;
      }
      }  
      return count;
    }
}