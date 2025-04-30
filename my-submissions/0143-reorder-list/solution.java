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
    public void reorderList(ListNode head) {
            if(head==null||head.next==null) return;
            ListNode s=head;
            ListNode f=head;
            while(f.next!=null&&f.next.next!=null){ 
                s=s.next;
                f=f.next.next;
            }
            ListNode mid=s;
            ListNode h2=s.next;
            while(h2.next!=null){
                ListNode cur=h2.next;
                h2.next=cur.next;
                cur.next=mid.next;
                mid.next=cur;
            }
            s=head;
            f=mid.next;
            while(s!=mid){
                mid.next=f.next;
                f.next=s.next;
                s.next=f;
                s=f.next;
                f=mid.next;
        }
    }
}
