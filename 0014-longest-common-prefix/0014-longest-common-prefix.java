class Solution {
    public String longestCommonPrefix(String[] strs) {
        String answer = "";
        for(int i=0; i<strs[0].length(); i++){
            char a = strs[0].charAt(i);
            for(int j=1; j<strs.length; j++){
                if(strs[j].length()-1 < i || a!=strs[j].charAt(i)){
                    return answer;
                }
            }
            answer += a;
        }
        return answer;
    }
}