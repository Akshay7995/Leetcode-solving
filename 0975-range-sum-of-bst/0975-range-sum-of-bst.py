# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
from queue import Queue
class Solution:
    def rangeSumBST(self, root: Optional[TreeNode], low: int, high: int) -> int:
        if not root:
            return 0
        q = Queue()
        q.put(root)
        ans = 0
        while not q.empty():
            curr = q.get()
            if curr.val >=low and curr.val<=high:
                ans+=curr.val
            if curr.left is not None :
                q.put(curr.left)
            if curr.right is not None :
                q.put(curr.right)
        
        return ans