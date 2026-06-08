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
    public ListNode partition(ListNode head, int x) {
        ListNode smallhead=new ListNode(0);
        ListNode greathead=new ListNode(0);
        ListNode small=smallhead;
        ListNode great=greathead;
        ListNode cur=head;
        while(cur!=null){
            if(cur.val<x){
                small.next=cur;
                small=small.next;
            }
            else{
                great.next=cur;
                great=great.next;
            }
            cur=cur.next;
        }
        great.next=null;
        small.next=greathead.next;
        return smallhead.next;
    }
}
