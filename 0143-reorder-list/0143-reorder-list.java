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
    // private void display(ListNode l){ //Pretty print LL for debugging
    //     while(l!=null){
    //         System.out.print(l.val +" -> ");
    //         l=l.next;
    //     }
    //     System.out.println(" NULL ");
    //     return;
    // }
    private ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        while(curr!=null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    public void reorderList(ListNode head) {
        if(head.next==null || head.next.next==null)//If LL size <=2, return
            return;
        ListNode slow = null;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            slow=slow==null?head:slow.next;
            fast=fast.next.next;
        }
        //Now slow pointer points to the end of Left LL
        //From the next pointer of slow we start the right LL and reverse it
        ListNode rList = reverse(slow.next);
        slow.next = null;
        ListNode lList = head;
        while(lList !=null){
            ListNode lNext = lList.next;
            lList.next = rList;
            ListNode rNext = rList.next;
            if(lNext==null) //If Left LL is echauxsted, exit
                break;
            rList.next = lNext;
            lList=lNext;
            rList=rNext;
        }
    }
}