public class Solution {
    public boolean isPalindrome(String s) {
        // 포인터를 문자열의 양 끝으로 이동합니다.
        int left = 0;
        int right = s.length() - 1;
        
        while (left < right) {
            char leftChar = Character.toLowerCase(s.charAt(left));
            char rightChar = Character.toLowerCase(s.charAt(right));
            
            // 왼쪽 포인터의 문자가 알파벳이나 숫자가 아니면 오른쪽으로 이동합니다.
            if (!Character.isLetterOrDigit(leftChar)) {
                left++;
                continue;
            }
            
            // 오른쪽 포인터의 문자가 알파벳이나 숫자가 아니면 왼쪽으로 이동합니다.
            if (!Character.isLetterOrDigit(rightChar)) {
                right--;
                continue;
            }
            
            // 두 문자가 다르면 회문이 아닙니다.
            if (leftChar != rightChar) {
                return false;
            }
            
            // 두 포인터를 한 칸씩 이동시킵니다.
            left++;
            right--;
        }
        
        // 모든 문자가 회문을 만족하면 true를 반환합니다.
        return true;
    }
}
