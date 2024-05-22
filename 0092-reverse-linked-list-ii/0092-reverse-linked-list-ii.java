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
    private ListNode rev(ListNode h){ //Function to reverse a LL
        ListNode prev = null;
        ListNode curr = h;
        while(curr!=null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    //Display function for debugging
    // private void display(ListNode l){
    //     while(l!=null){
    //         System.out.print(l.val +" -> ");
    //         l=l.next;
    //     }
    //     System.out.println(" NULL ");
    //     return;
    // }
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head==null || head.next==null || left==right)
            return head;
        ListNode dummy = new ListNode(0, head);
        ListNode l = dummy;
        int count = 0;
        while(count+1<left){ //Reaching the (left-1)th element of the list  
            l=l.next;
            count++;
        }
        // System.out.println("Left val: "+l.val);
        ListNode r = l; //Pointer to reach the rth node
        while(count<right){
            r=r.next;
            count++;
        }
        // System.out.println("RIghht val: "+r.val);
        ListNode rHead = r.next!=null ? r.next :null; //Head for the LL after rth node
        r.next=null; //Terminating the LL to be reversed
        l.next = rev(l.next); //Assigning the reversed LL to Left LL's next
        while(l.next!=null) //Reaching the end of reversed part
            l=l.next;
        l.next = rHead; //Joining the reversed part with right LL
        // display(dummy);
        // display(rev(head));
        // display(head);
        return dummy.next;
    }
}