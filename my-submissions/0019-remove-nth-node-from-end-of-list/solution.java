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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode tem=head;
        int len=0;
        while(tem!=null){
            tem=tem.next;
            len++;
        }
        if(len==n){return head.next;}
        ListNode pre=head;
        int step=len-n-1;
        while(step>0){
            pre=pre.next;
            step--;
        }
        pre.next=pre.next.next;
        return head;
    }
}
