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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode head = null;
        ListNode temp = null;

        int sum = 0;
        int remainder = 0;

        while(true) {

            int value = 0;
            if(l1 != null) {
                value += l1.val;
                l1 = l1.next;
            }

            if(l2 != null) {
                value += l2.val;
                l2 = l2.next;
            }

            value += remainder;
            sum = value % 10;

            if(head == null) {
                head = new ListNode(sum);
                temp = head;
            } else {
                temp.next = new ListNode(sum);
                temp = temp.next;
            }
            
            remainder = value / 10;

            if(l1 == null && l2 == null) {
                if(remainder == 0) {
                    break;
                }
            }
        }

        return head;
    }
}
