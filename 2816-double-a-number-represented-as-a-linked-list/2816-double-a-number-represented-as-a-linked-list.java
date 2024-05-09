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
    private ListNode rev(ListNode head){
        ListNode l=null;
        ListNode r=head;
        while(r!=null){
            ListNode n=r.next;
            r.next=l;
            l=r;
            r=n;
        }
        return l;
    }
    public ListNode doubleIt(ListNode head) {
        //Reverse the linked list
        ListNode reversed = rev(head);
        ListNode n = reversed;
        //Handle carry
        int carry=0;
        while(n!=null){
            //Double the current value and also add any previous carry
            int newVal = ((2*n.val)+carry);
            n.val = newVal % 10;
            carry = newVal/10;
            //If we are at the last node and we have a carry remaining, just add a new node with carry and break
            if(n!=null && n.next==null && carry==1){
                n.next = new ListNode(1);
                break;
            }
            n=n.next;
        }
        //Reverse the doubled linked list again before returning
        return rev(reversed);
    }
}