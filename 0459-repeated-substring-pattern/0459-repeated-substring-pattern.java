class Solution {
    public boolean repeatedSubstringPattern(String s) {
        
        for(int i=1; i<s.length(); i++){
            if(s.length() % i != 0) continue;
            String sub = s.substring(0,i);
            boolean flag=false;
            for(int j=0; j<s.length(); j+=i){

                if(sub.equals(s.substring(j,j+i))){
                    flag = true;
                }
                else{
                    flag = false;
                    break;
                }
            }
            if(flag) return true;
        }
        return false;
    }
}