class Solution {
    public int[] plusOne(int[] digits) {
        int carry=1;
        List<Integer> li = new ArrayList<Integer>();
        
        for(int i=digits.length-1; i>=0; i--){
            digits[i] += carry;
            if(digits[i]>=10){
                digits[i] %= 10;
                carry = 1;
            }
            else{
                carry = 0;
            }
            
            li.add(digits[i]);
            
            if(i==0 && carry==1){
                li.add(carry);
            }
        }
        
        int[] answer = new int[li.size()];
        for(int i=0; i<answer.length; i++){
            answer[i] = li.get(answer.length-i-1);
        }
        return answer;
    }
}