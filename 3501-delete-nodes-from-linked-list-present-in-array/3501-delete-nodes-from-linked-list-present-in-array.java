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
    public ListNode modifiedList(int[] nums, ListNode head) {
        Set<Integer> set = new HashSet<>();
        for(int i: nums)
            set.add(i);
        while(set.contains(head.val))//Get the first node that is not in nums
            head=head.next;
        ListNode dummy = new ListNode(0, head);
        while(head!=null){//Populate remaininng nodes
            ListNode temp = head.next;
            while(temp!=null && set.contains(temp.val))
                temp=temp.next;
            head.next=temp;
            head=head.next;
        }
        return dummy.next;
    }
}