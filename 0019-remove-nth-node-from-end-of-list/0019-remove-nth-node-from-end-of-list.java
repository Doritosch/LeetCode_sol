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
    public int findLength(ListNode head){
        ListNode temp = head;
        int count=0;
        while(head != null){
            head = head.next;
            count++;
        }
        return count;
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        int len = findLength(head);
        int targetIndex = len-n+1;
        
        ListNode prev=null;
        ListNode temp=head;
        for(int i=1; i<targetIndex; i++){
            prev = temp;
            temp=temp.next;
        }
        if(prev==null){
            head=head.next;
            return head;
        }
        else{
            prev.next=prev.next.next;
            return head;
        }
        
    }
}