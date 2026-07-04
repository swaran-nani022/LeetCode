/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head==null)return null;
        HashMap<Node,Node> hm=new HashMap<>();
        Node cur=head;
        while(cur!=null){
            hm.put(cur,new Node(cur.val));
            cur=cur.next;
        }
        cur=head;
        while(cur!=null){
            hm.get(cur).next=hm.get(cur.next);
            hm.get(cur).random=hm.get(cur.random);
            cur=cur.next;
        }
        return hm.get(head);
    }
}
