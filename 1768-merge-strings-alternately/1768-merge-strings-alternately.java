class Solution {
    public String mergeAlternately(String word1, String word2) {
        // 두 word의 길이를 비교하여 짧은 것을 기준으로 merge하도록 하자.
        int word1Length = word1.length();
        int word2Length = word2.length();
        String word = "";
        int i=0;
        if(word1Length <= word2Length){
            for(i=0; i<word1Length; i++){
                word = word + word1.charAt(i);
                word = word + word2.charAt(i);
            }
            word = word + word2.substring(i, word2.length());
        }
        else{
            for(i=0; i<word2Length; i++){
                word = word + word1.charAt(i);
                word = word + word2.charAt(i);
            }
            word = word + word1.substring(i, word1.length());
        }

        return word;     
    }
}