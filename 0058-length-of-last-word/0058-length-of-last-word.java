import java.util.StringTokenizer;
class Solution {
    public int lengthOfLastWord(String s) {
        StringTokenizer st = new StringTokenizer(s);
        String answer = "";

        while(st.hasMoreTokens()){
            answer = st.nextToken();
        }
        int answerLength = answer.length();

        return answerLength;
    }
}