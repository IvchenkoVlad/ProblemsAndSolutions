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
    public ListNode reverseList(ListNode head) {
        List<Integer> copy = new ArrayList<>();
        while(head != null){
            copy.add(head.val);
            head = head.next;
        }
        ListNode rev = new ListNode(0);
        ListNode h = rev;
        for(int i = copy.size()-1; i >= 0; i--){
            ListNode cur = new ListNode(copy.get(i));
            h.next = cur;
            h = h.next;
        }
        //System.out.println(copy);
        return rev.next;
    }
}