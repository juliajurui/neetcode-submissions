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
    public boolean hasCycle(ListNode head) {
        ListNode dummy = head;
        //Hashset ignores duplicates
        ArrayList<ListNode> seen = new ArrayList<>();

        while (dummy != null){

            if (seen.contains(dummy)){
                return true;
            }
            seen.add(dummy);
            dummy = dummy.next;
        }

        return false;
    }
}
