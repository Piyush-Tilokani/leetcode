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
    private ListNode reverse(ListNode og){ // Function to reverse a linked list 
        ListNode l=null;                   //https://leetcode.com/problems/reverse-linked-list/ 
        ListNode r=og;
        while(r!=null){
            ListNode nex=r.next;
            r.next=l;
            l=r;
            r=nex;
        }
        return l;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode rev1= reverse(l1); //Reverse both the linked lists 
        ListNode rev2= reverse(l2);
        ListNode add= new ListNode((rev1.val+rev2.val)%10);
        ListNode ans = add;
        int carry=(rev1.val+rev2.val)/10;
        rev1=rev1.next;
        rev2=rev2.next;
        while(rev1!=null || rev2!=null){ //Add two numbers algorithm https://leetcode.com/problems/add-two-numbers/
            if(rev1!=null && rev2!=null){
                int sum=rev1.val+rev2.val+carry;
                add.next=new ListNode(sum%10);
                carry=sum/10;
                add=add.next;
                rev1=rev1.next;
                rev2=rev2.next;
            }
            else if(rev1==null){
                int sum=rev2.val+carry;
                add.next=new ListNode(sum%10);
                carry=sum/10;
                add=add.next;
                rev2=rev2.next;
            }
            else if(rev2==null){
                int sum=rev1.val+carry;
                add.next=new ListNode(sum%10);
                carry=sum/10;
                add=add.next;
                rev1=rev1.next;
            }
        }
        if(carry>0){
            add.next=new ListNode(carry);
            return reverse(ans);
        }
        return reverse(ans);
    }
}