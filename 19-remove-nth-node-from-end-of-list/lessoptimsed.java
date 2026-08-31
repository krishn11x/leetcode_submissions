class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next =head;


        int len =0;

        ListNode l = head;

// ll lenth calculate
        while (l!= null){
            len++;
            l=l.next;

        }
        int d = len-n+1;

        ListNode prev = dummy,
                 curr = head;

        int i =0;
        while( i<(d-1)){
            curr=curr.next;
            prev = prev.next;
            i++;
        }
        prev.next = curr.next;
        return dummy.next;
    }
}
