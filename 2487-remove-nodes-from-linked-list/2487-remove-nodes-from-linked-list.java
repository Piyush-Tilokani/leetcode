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
    public ListNode removeNodes(ListNode head) {
        //Reverse the linked list
        ListNode reversed = rev(head);
        int max = reversed.val;
        ListNode l = reversed;
        ListNode r = reversed.next;
        while(l!=null){
            //In the reversed lnked list, if the next element is smaller than the current max,
            //skip the element. 
            if(r!=null && r.val<max)
                r=r.next;
            // If it is greater than or equal to the current max, 
            //Update the current max and adjust the links accordingly
            else if(r!=null){
                max=Math.max(max, r.val);
                l.next=r;
                l=r;
                r=r.next;
            }
            //If the right pointer reaches the end, adust the left pointer to end the list
            else if(r==null){
                l.next=r;
                l=l.next;
            }
        }
        //Reverse the list again and return it
        return rev(reversed);
    }
}