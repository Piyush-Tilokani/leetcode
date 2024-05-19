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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null)
            return head;
        if(k==0) //If k is already 0 return
            return head;
        //Approach: 
        // Since length of list ranges from [0, 500] and kk ranges from [0, 2 * 10^9], 
        //Traversing the whole list and then rotating k%length times makes code faster
        int len = 0;
        ListNode dummy = head;
        while(dummy!=null){
            len++;
            dummy=dummy.next;
        }
        // System.out.println("Len: "+len);
        k %= len; //If new k(i.e k%len) is 0 return
        if(k==0)
            return head;
        ListNode fast = head;
        while(k>0){
            fast=fast.next;
            k--;
        }
        ListNode slow = head; 
        while(fast.next!=null){
            fast=fast.next;
            slow=slow.next;
        }
        ListNode newHead = slow.next;
        slow.next=null;
        ListNode junction = newHead;
        while(junction.next!=null)
            junction=junction.next;
        junction.next = head;
        // System.out.println("Slow: "+slow.val+", Fast: "+fast.val);
        return newHead;
    }
}