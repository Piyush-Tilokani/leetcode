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
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int[][] ans = new int[m][n];
        int l=0;
        int r=n-1;
        int u=0;
        int d=m-1;
        //Fill the matrix with -1s
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                ans[i][j] = -1;
            }
        }
        //While LinkedList has elements, add to spiral matrix
        while(head!=null){
            for(int i=l; i<=r; i++){
                ans[u][i] = head!=null ? head.val : -1;
                head = head!=null ? head.next : null;
            }
            u++;
            for(int i=u; i<=d; i++){
                ans[i][r] = head!=null ? head.val : -1;
                head = head!=null ? head.next : null;
            }
            r--;
            if(u<=d){
                for(int i=r; i>=l; i--){
                    ans[d][i] = head!=null ? head.val : -1;
                    head = head!=null ? head.next : null;
                }
            }
            d--;
            if(l<=r){
                for(int i=d; i>=u; i--){
                    ans[i][l] = head!=null ? head.val : -1;
                    head = head!=null ? head.next : null;
                }
            }
            l++;
        }
        return ans;
    }
}