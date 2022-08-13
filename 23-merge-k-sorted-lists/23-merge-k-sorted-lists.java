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
    public ListNode mergeKLists(ListNode[] lists) {
        List<Integer> values = new ArrayList<>();
        for(ListNode node : lists){
            while(node != null){
                values.add(node.val);
                //System.out.println(node.val);
                node = node.next;
                
            }
        }
        Collections.sort(values);
        
        ListNode head = new ListNode(0);
        ListNode h = head;
        for(int item : values){
            //new node
            ListNode temp = new ListNode(item);
            h.next = temp;
            h = h.next;
        }
        return head.next;
    }
}