class Solution {
    public boolean isAnagram(String s, String t) {
        int[] word_1 = new int[26];
        int[] word_2 = new int[26];
        
        for(int i=0; i<s.length(); i++){
            word_1[s.charAt(i)-'a']++;
        }
        for(int i=0; i<t.length(); i++){
            word_2[t.charAt(i)-'a']++;
        }
        
        for(int i=0; i<word_1.length; i++){
            if(word_1[i]!=word_2[i]) return false;
        }
        return true;
    }
}