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
    public int getDecimalValue(ListNode head) {
        ListNode curr = head;
        ArrayList<Integer> l = new ArrayList<>();
        while(curr!=null){
            l.add(curr.val);
            curr = curr.next;
        }
        int temp = 0;
        for(int i=0;i<l.size();i++){
            temp = temp*2+l.get(i);
        }
        return temp;
    }
}