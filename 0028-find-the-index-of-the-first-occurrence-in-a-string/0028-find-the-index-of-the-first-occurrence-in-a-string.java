class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack.length() < needle.length()){
            return -1;
        }
        
        int check = -1;

        for(int i=0; i<haystack.length(); i++){
            if(needle.charAt(0)==haystack.charAt(i) && (i+needle.length() <= haystack.length())){
                check = i;
                String compare = haystack;
                compare = compare.substring(i,i+needle.length());
                if(compare.equals(needle)){
                    return check;
                }
                else{
                    check = -1;
                }
            }
        }
        return -1;
    }
}