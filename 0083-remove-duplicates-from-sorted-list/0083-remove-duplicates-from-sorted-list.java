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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode start = head;
        while(start!=null){
            if(start.next==null)
                break;
            if(start.val==start.next.val)
                start.next=start.next.next;
            else
                start = start.next;
        }
        return head;
    }
}