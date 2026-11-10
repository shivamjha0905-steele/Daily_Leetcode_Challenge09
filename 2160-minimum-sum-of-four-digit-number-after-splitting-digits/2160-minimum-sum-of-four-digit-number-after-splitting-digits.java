class Solution {
    public int minimumSum(int num) {
        int n = num;
        int new1[] = new int[4];
        for(int i = 0; i < 4; i++){
            new1[i] = num % 10;
            num /= 10;
        }
        Arrays.sort(new1);
        int num1 = new1[0] * 10 + new1[2];
        int num2 = new1[1] * 10 + new1[3];
        return num1 + num2;
    }
}