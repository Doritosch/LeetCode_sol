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
    public ListNode reverseList(ListNode head) {
        ListNode reverseList = null;
        ListNode current = head;
        
        while(current != null){
            ListNode temp = new ListNode(current.val);
            temp.next = reverseList;
            reverseList = temp;
            current =  current.next;
        }
        return reverseList;
    }
}