/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode revHalf = null;
        ListNode cur = head;
        ListNode checkHalf = head.next;
        
        while(checkHalf != null && checkHalf.next != null){
            cur = cur.next;
            checkHalf = checkHalf.next.next;
        }
        
        cur = cur.next;
        while(cur != null){
            ListNode temp = new ListNode(cur.val);
            temp.next = revHalf;
            revHalf = temp;
            cur = cur.next;
        }
        
        while(revHalf != null){
            if(revHalf.val != head.val){
                return false;
            }
            revHalf = revHalf.next;
            head = head.next;
        }
        return true;
    }
}