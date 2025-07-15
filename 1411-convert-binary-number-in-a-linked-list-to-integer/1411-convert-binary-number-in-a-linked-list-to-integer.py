# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def getDecimalValue(self, head: Optional[ListNode]) -> int:
        l =  []
        curr = head
        while curr:
            l.append(curr.val)
            curr = curr.next
        
        ans = 0
        for bit in l:
            ans = ans*2+bit
        
        return ans