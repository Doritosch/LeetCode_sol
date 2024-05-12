class Solution {
    public char findTheDifference(String s, String t) {
        int[] alphabet = new int[26];
        char result = 'a';

        for(int i=0; i<s.length(); i++){
            alphabet[s.charAt(i) - 'a']--;
        }

        for(int i=0; i<t.length(); i++){
            alphabet[t.charAt(i) - 'a']++;
        }

        for(int i=0; i<26; i++){
            if(alphabet[i] == 1){
                result = (char)(i+'a');
                break;
            }
            
        }
        return result;
    }
}