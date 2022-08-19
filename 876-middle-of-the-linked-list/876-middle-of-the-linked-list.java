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
        ListNode copy = head;
        int counter = 0;
        while(copy!=null){
            counter++;
            copy=copy.next;
        }
        counter = (counter / 2) + 1;
        
        while(counter > 1){
            head = head.next;
            counter--;
        }
        return head;
    }
}