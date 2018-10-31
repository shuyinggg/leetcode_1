/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int x = 0;
        int y = 0;
        //get the head of the returned list, since l1 and l2 are nonempty no need to consider the null/empty case
        int sum = l1.val + l2.val;
        ListNode head = new ListNode(sum%10);
        ListNode curr = head;
        // 进位点
        int carry = sum/10;
        
        l1 = l1.next;
        l2 = l2.next;
        while (l1 != null || l2 != null) {
            if (l1 != null) {
                x = l1.val; 
                l1 = l1.next;
            } else {
                x = 0;
            }
            if (l2 != null) {
                y = l2.val;
                l2 = l2.next;
            } else {
                y = 0;
            }
            //new number put in the next Node
            sum = x + y + carry;
            carry = sum/10;
            ListNode newNode = new ListNode(sum%10);
            curr.next = newNode;
            curr = curr.next;
        }
        //if we carry is not 0, create a new node to put it in
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }
        return head;
    }
}

//Don't do it by converting it into two numbers, then sum, then converting back. In this case, need to consider really big integers. 
