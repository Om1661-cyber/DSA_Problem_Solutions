class Solution {
    public String removeStars(String s) {
        Stack<Character> ans = new Stack<>();

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch != '*'){
                ans.push(ch);
            }
            else{
                ans.pop();
            }
        }
        if(ans.isEmpty()){
            return "";
        }
        StringBuilder rev = new StringBuilder();
        for(char i : ans){
            rev.append(i);
        }
        return rev.toString();
    }
}