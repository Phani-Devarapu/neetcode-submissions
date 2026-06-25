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
    public void reorderList(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next !=null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }

        // at end  of this looops we have slow at mid and fast may at end

        ListNode tbRev = slow.next;
        slow.next = null;
        ListNode reversed = reverse(tbRev);
        
        ListNode result = head;

        while(result != null && reversed !=null){
            ListNode nextNodes = result.next;
            ListNode temp = new ListNode(reversed.val);
        
            reversed = reversed.next;

            
            result.next = temp;
            temp.next = nextNodes;

            if (result.next != null) {
                result = result.next.next;
            } else {
                result = result.next;
            }

        }

      //  return head;
        
    }

    private ListNode reverse(ListNode rev){
        ListNode dummy = new ListNode(-1);
    
        while(rev != null){
         ListNode temp = dummy.next;
         ListNode next = rev.next;
      
         dummy.next = rev;
         rev.next = temp;

         rev = next;

        }
        return dummy.next;
    }
}
