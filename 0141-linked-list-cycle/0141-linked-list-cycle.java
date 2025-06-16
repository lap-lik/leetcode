/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        Set<ListNode> checkingSet = new HashSet();
        while(head != null){
          boolean temp = checkingSet.add(head);
          if (!temp){
              return true;
          }
          head = head.next;
        }

        return false;
    }
}