class Solution {
    public void reverseString(char[] s) {
        int length=s.length-1;
        for(int i=0; i<length/2+1; i++){
            char temp=s[i];
            s[i]=s[length-i];
            s[length-i]=temp;
        }
    }
}