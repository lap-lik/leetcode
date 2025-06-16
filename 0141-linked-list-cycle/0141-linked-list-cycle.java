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
        // Set<ListNode> checkingSet = new HashSet();
        // while(head != null){
        //   if (!checkingSet.add(head)){
        //       return true;
        //   }
        //   head = head.next;
        // }

        // return false;

        if (head == null || head.next == null){
            return false;
        }

        ListNode slow = head;
        ListNode fast = head;

        while (slow != null && fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow){
                return true;
            }
        }

        return false;
    }
}