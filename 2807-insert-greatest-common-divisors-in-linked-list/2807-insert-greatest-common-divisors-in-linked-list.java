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
    private int gcd(int a, int b){
        int ans = Math.min(a, b);
        while(ans>=1){
            if(a%ans==0 && b%ans==0)
                return ans;
            ans--;
        }
        return 1;
    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode l = head;
        ListNode r = head.next;
        while(r!=null){
            int val = gcd(l.val, r.val);
            ListNode node = new ListNode(val);
            l.next = node;
            node.next = r;
            l=r;
            r = r.next;
        }                     
        return head;
    }
}