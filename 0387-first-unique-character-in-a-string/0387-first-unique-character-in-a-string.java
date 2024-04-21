class Solution {
    public int firstUniqChar(String s) {
        int[] checked = new int[26];

        for(int i=0; i<s.length(); i++){
            checked[s.charAt(i)-'a'] += 1;
        }

        for(int i=0; i<s.length(); i++){
            if(checked[s.charAt(i) - 'a']==1){
                return i;
            }
        }
        return -1;
    }
}