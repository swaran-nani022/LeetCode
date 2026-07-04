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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode l1=list1;
        ListNode l2=list2;
        ListNode res=new ListNode(0);
        ListNode pre=res;
        while(l1!=null && l2!=null){
            if(l1.val<=l2.val){
                pre.next=l1;
                // pre=pre.next;
                l1=l1.next;
            }
            else{
                pre.next=l2;
                // pre=pre.next;
                 l2=l2.next;
            }
            pre=pre.next;
        }
        if(l1!=null){
            pre.next=l1;
        }
        else{
            pre.next=l2;
        }
        return res.next;
    }
}
