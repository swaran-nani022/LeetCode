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
    public boolean isPalindrome(ListNode head) {
        ListNode mid=mid(head);
        ListNode h2=mid.next;
        mid.next=null;
        h2=rev(h2);
        while(head!=null && h2!=null){
            if(head.val != h2.val ) return false;
            head=head.next;
            h2=h2.next;
        }
        return true;
    }
    public ListNode mid(ListNode head){
        ListNode s=head;
        ListNode f=head;
        while(f.next!=null && f.next.next!=null){
            s=s.next;
            f=f.next.next;
        }
        return s;
    } 

    public ListNode rev(ListNode h2){
       if(h2==null || h2.next==null) return h2;
       ListNode r=rev(h2.next);
       h2.next.next=h2;
       h2.next=null;
       return r;
    }
}
