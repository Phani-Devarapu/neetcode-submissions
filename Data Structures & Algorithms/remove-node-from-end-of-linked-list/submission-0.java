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
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode slow = head;
        ListNode fast = head;

        int slowc=1;
        int fastc=1;
        
        while(fast!=null && fast.next != null){
            fast= fast.next.next;
            slow=slow.next;
            slowc++;
            fastc= fastc+2;
        }

        if(fast == null){
           fastc--;
        }

        System.out.println("slow "+ slowc + " fastc " + fastc );

        n = fastc-n+1;
            ListNode current = head;
            ListNode prev = null;

            int c=1;

            if(n ==1){
                return head.next;
            }
        
            while(current !=null){
                 if(c == n){
                    // remove the node
                     System.out.println("slow "+ slowc + " fastc " + fastc );
                    prev.next= current.next;
                 }
                 prev = current;
                 current = current.next;
                 c++;
            }

            return head;
    }
}
