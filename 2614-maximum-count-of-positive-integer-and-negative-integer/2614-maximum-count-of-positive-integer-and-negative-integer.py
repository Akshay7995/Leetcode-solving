class Solution:
    def maximumCount(self, nums: List[int]) -> int:
        pos,neg,zero = 0,0,0
        for i in nums:
            if i<0:
                neg+=1
            elif i>0:
                pos+=1
            else:
                zero +=1
        return max(pos,neg)