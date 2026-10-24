class Solution {
    public int alternateDigitSum(int n) {
        int count = 0;
        int original = n;
        while(original > 0){
            count++;
            original /= 10;
        }
        int arr[] = new int[count];
        int idx = count - 1;
       while(n > 0){
        arr[idx--] = (n % 10);
        n /= 10;
       }
       int ans = 0;
      
       for(int i = 0; i < count; i++){
        if(i % 2 == 0){
        ans += arr[i];
        }
        else{
        ans -= arr[i];
        }
       }
       return ans;
    }
}