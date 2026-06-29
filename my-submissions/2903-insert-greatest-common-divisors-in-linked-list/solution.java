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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode pre=head;
        ListNode cur=head.next;
        while(cur!=null){
            int a=pre.val;
            int b=cur.val;
            int gcd=fun(a,b);
            ListNode gnode=new ListNode(gcd);
            pre.next=gnode;
            gnode.next=cur;
            pre=cur;
            cur=cur.next;
        }
        return head;
    }
    public int fun(int a,int b){
        if(b==0)return Math.abs(a);
        return fun(b,a%b);
    }
}
