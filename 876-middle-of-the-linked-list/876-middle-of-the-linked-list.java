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
    public ListNode middleNode(ListNode head) {
        int counter = 0;
        ListNode s = head;
        while(head != null){
            System.out.println(head.val);
            head = head.next;
            counter++;
        }
        counter = (counter / 2) + 1;
        while(counter-1 != 0){
            System.out.println(s.val);
            s = s.next;
            counter--;
        }
        return s;
    }
}