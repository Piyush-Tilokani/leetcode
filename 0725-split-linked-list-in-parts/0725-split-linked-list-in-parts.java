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
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode [] ans = new ListNode[k];
        if(head==null)
            return ans;
        int n=0;
        ListNode node=head;
        while(node!=null){
            n++;
            node=node.next;
        }
        node = head;
        int i=0;
        while(node!=null && k!=0){
            int partSize = (int)Math.ceil(1.0*n/k);
            // System.out.println("n: "+n+", partSize: "+partSize+", head: "+node.val);
            n-=partSize;
            ListNode tempT = node; //Temp head node
            ListNode tempH = node; //Temp tail node
            while(tempT!=null && partSize!=1){
                tempT=tempT.next;
                partSize--;
            }
            node = tempT!=null ? tempT.next : null;
            if(tempT!=null && tempT.next!=null)
                tempT.next=null;
            ans[i++] = tempH;
            k--;
        }
        return ans;
    }
}