class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> res = new ArrayList<>();
        int n = words.length;
        for(int i = 0; i < n; i++){
            String s = words[i];
            for(int j = 0; j < s.length(); j++){
                char c = s.charAt(j);
                if(c == x){
                    res.add(i);
                    break;
               }
                }
            }
        return res;
    }
}