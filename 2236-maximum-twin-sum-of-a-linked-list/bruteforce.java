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
    public int pairSum(ListNode head) {
        List<Integer> arr = new ArrayList();

        ListNode temp = head;

        while(temp!= null){
            arr.add(temp.val);
            temp = temp.next;
        }
        int i = 0,
            max = 0,
            sum=0,
            j = arr.size()-1;

        while(i<j){
            sum = arr.get(i)+arr.get(j);
            
            
            if(sum >max){
                max = sum;
            }
            i++;
            j--;
        }
        return max;
    }
}
