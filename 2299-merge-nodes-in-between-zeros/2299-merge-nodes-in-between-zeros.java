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
    public ListNode mergeNodes(ListNode head) {
        ListNode l= head;
        ListNode r= head.next;
        ListNode ans= head;
        while(l!=null || r!=null){
            int sum=0;
            while(r!=null && r.val!=0){
                sum += r.val;
                r=r.next;
            }
            l.val=sum;
            if(r!=null){
                r=r.next;
                l.next=r;
            }
            else if(r==null ||r.next==null){
                l.next=null;
            }
            l=l.next;
        }
        return ans;
    }
}