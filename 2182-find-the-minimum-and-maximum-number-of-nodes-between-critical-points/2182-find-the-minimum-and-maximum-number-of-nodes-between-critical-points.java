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
    private boolean isCritical(ListNode node){ //Function to check local maxima/minima
        if(node.val < node.next.val && node.next.val > node.next.next.val)
            return true;
        if(node.val > node.next.val && node.next.val < node.next.next.val)
            return true;
        return false;
    }
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        if(head.next.next==null || head.next.next.next==null) //If LL length <=3 
            return new int[]{-1, -1};
        int ans []= new int[2];
        ListNode critical = head;
        int i = 1;
        int prev = 0;
        //Find the 1st critical point
        while(critical.next!=null && critical.next.next!=null){
            if(isCritical(critical)){
                ans[1] = -(i+1); //Set max = -ve of index of 1st critical (maxDistance will be calculated at the end)
                prev=i+1;
                break;
            }
            i++;
            critical=critical.next;
        }
        critical=critical.next;
        i++;
        while(critical.next!=null && critical.next.next!=null){
            if(isCritical(critical)){
                ans[0] = ans[0] == 0 ? i+1-prev: Math.min(ans[0], i+1-prev); //Keep updating the minimumDistance
                prev=i+1; //Update the index of previous critical
            }
            i++;
            critical=critical.next;
        }
        ans[1]+=prev; //For max, find the difference b/w first and last critical point (-index of 1st critical + index of last critical)
        if(ans[1]<=0) //If maxDistance is non positive, it means only 1 critical point exists therefore return -1, -1
            return new int[]{-1, -1};
        return ans;
    }
}