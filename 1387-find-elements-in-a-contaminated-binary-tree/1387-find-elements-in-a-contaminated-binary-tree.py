class FindElements:
    def __init__(self, root: Optional[TreeNode]):
        self.s = set()
        if root is not None:
            self.helper(root,0)

    def helper(self,node:Optional[TreeNode],value:int):
        if node is None :
            return
        node.val = value
        self.s.add(node.val)
        self.helper(node.left,2*value+1)
        self.helper(node.right,2*value+2)


    def find(self, target: int) -> bool:
        return target in self.s