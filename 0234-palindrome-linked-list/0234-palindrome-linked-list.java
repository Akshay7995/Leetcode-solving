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
    public boolean isPalindrome(ListNode head) {
        //int num = 0;
        ArrayList<Integer> l = new ArrayList<>();
        ListNode temp = head;
        while(temp!=null){
            int val = temp.val;
            l.add(val);
            temp = temp.next;
        }
        int p1 = 0;
        int p2 = l.size()-1;
        while(p1<p2){
            if(l.get(p1)==l.get(p2)){
                p1+=1;
                p2-=1;
            }else{
                return false;
            }
        }
        return true;

    }
}