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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode nodeA = list1;
        ListNode nodeB = list1;
        while(a!=1){
            nodeA = nodeA.next;
            a--;
        }
        while(b!=-1){
            nodeB = nodeB.next;
            b--;
        }
        System.out.println(nodeA.val);
        System.out.println(nodeB.val);
        nodeA.next = list2;
        ListNode tail2 = list2;
        while(tail2.next!=null){
            tail2 = tail2.next;
        }
        tail2.next = nodeB;
        return list1;
    }
}