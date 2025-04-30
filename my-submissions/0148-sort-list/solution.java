class Solution {
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode mid=mid(head);
        ListNode h1=mid.next;
        mid.next=null;

        head=sortList(head);
        h1=sortList(h1);
        return merge(head,h1);
    }
   
    public ListNode mid(ListNode head){
        ListNode s=head;
        ListNode f=head;
        while(f.next!=null && f.next.next!=null ){
            s=s.next;
            f=f.next.next;
        }
        return s;
    }
     public ListNode merge(ListNode list1,ListNode list2){
         ListNode dummy=new ListNode(10);
         ListNode cur=dummy;
        while(list1 != null && list2 != null){
            if(list1.val < list2.val){
                cur.next=list1;
                list1=list1.next;
            }
            else{
                cur.next=list2;
                list2=list2.next;
            }
            cur=cur.next;
        }
       cur.next=(list1==null)?list2 : list1;
       return dummy.next;
    }
}
