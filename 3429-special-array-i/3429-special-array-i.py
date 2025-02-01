class Solution:
    def checking(self,num):
        if num%2 == 0:
            return True
        else:
            return False

    def isArraySpecial(self, nums: List[int]) -> bool:
        if len(nums)==1:
            return True
        i = 1
        while i<len(nums):
            if self.checking(nums[i-1]) == self.checking(nums[i]):
                return False
            i+=1
        
        return True
        
