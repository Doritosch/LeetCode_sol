class Solution {
    public String mergeAlternately(String word1, String word2) {
        int minLength = Math.min(word1.length(), word2.length());
        String result = "";
        int i;
        for(i=0; i<minLength; i++){
            result += word1.charAt(i);
            result += word2.charAt(i);
        }

        result += word1.substring(i) + word2.substring(i);
        return result;
    }
}