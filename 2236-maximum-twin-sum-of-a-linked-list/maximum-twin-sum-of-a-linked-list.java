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
    public ListNode reverseList(ListNode head) {
    ListNode prev = null;
    ListNode curr = head;

    while(curr != null) {
        ListNode next = curr.next;

        curr.next = prev;
        prev = curr;
        curr = next;
    }

    return prev;
}
    public int pairSum(ListNode head) {
        ListNode slow = head,
                fast = head;
        while(fast != null){ // even h elements so fast hmesha null pe aake rukega usse pehle nhi
            slow = slow.next;
            fast = fast.next.next;

        }
        ListNode p1 = head;
        ListNode p2 = reverseList(slow);
        int max = Integer.MIN_VALUE;
        while(p1!=null && p2!=null){
            int sum = p1.val + p2.val;
            if(sum>max){
                max = sum;
            }
            p1= p1.next;
            p2 = p2.next;
        }
        return max;
    }
}