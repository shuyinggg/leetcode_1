/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
//example: 1->2->3->4->5
class Solution {
    public ListNode reverseList(ListNode head) {
      if (head == null)
          return null;
      else {
            ListNode prev = null;
            ListNode curr = head; //curr:1->2->3->4->5
            ListNode next = null;
            while (curr.next != null){
                prev = curr.next; //prev: 2->3->4->5; 3->4->5;4->5;5;
                curr.next = next; // curr: 1->null; 2->1->null;3->2->1->null;4->3->2->1->null;
                next = curr;//next: 1->null;2->1->null;3->2->1->null;4->3->2->1->null;
                curr = prev; //curr: 2->3->4->5; 3->4->5;4->5;5;
          }
          curr.next = next; //5->4->3->2->1->null;
          //if list only contains one element, still returns the correct result
          return curr;
      }
        
    }
}

/*
1. create three new nodes to manipulate this LinkedList.
2. draw a graph to understand manipulations.
3. this is a iterative solution.
*/
