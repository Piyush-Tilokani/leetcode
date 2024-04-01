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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode add = new ListNode((l1.val+l2.val)%10);
        ListNode ans = add;
        int carry=(l1.val+l2.val)/10;
        l1 = l1.next;
        l2 = l2.next;
        while(l1!=null || l2!=null){
            int sum=0;
            if(l1!=null && l2!=null){
                sum += l1.val + l2.val + carry;
                ListNode nex = new ListNode(sum%10);
                add.next = nex;
                carry = sum/10;
                add = add.next;
                l1 = l1.next;
                l2 = l2.next;
            }
            else if(l1==null){
                sum += l2.val + carry;
                ListNode nex = new ListNode(sum%10);
                add.next = nex;
                carry = sum/10;
                add = add.next;                
                l2 = l2.next;
            }
            else if(l2==null){
                sum += l1.val + carry;
                ListNode nex = new ListNode(sum%10);
                add.next = nex;
                carry = sum/10;
                add = add.next;
                l1 = l1.next;
            }
        }
        if(carry>0){
            add.next = new ListNode(carry);
        }
        return ans;
    }
}