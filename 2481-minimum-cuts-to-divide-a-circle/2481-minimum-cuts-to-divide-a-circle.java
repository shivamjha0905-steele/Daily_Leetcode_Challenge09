class Solution {
    public int numberOfCuts(int n) {
     int cuts = 0;
     if(n == 1){
        return 0;
     }
       if(n % 2 == 0){
        cuts = n/2;
       } 
       else{
        cuts = n;
       }
       return cuts;
    }
}