class Solution {
    public int minimumPushes(String word) {
        int ans = 0;
        int level = 1;
        int usedkey = 0;
        for(int i = 0; i < word.length(); i++){
            ans += level;
            usedkey ++;
            if(usedkey == 8){
                level += 1;
                usedkey = 0;
            } 

        }
        return ans;
    }
}