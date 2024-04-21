class Solution {
    public int firstUniqChar(String s) {
        int[] checked = new int[s.length()];
        
        for(int i=0; i<s.length(); i++){
            for(int j=0; j<s.length(); j++){
                if(s.charAt(i)==s.charAt(j) && i!=j){
                    checked[i]++;
                    checked[j]++;
                    break;
                }
            }
        }
        
        for(int i=0; i<s.length(); i++){
            if(checked[i]==0){
                return i;
            }
        }
        return -1;
    }
}