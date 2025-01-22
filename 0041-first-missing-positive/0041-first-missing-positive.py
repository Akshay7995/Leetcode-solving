class Solution:
    def firstMissingPositive(self, nums: List[int]) -> int:
        nums = [n for n in nums if n>0]
        nums.sort()
        temp = 1
        for num in nums:
            if num == temp:
                temp+=1
            elif num>temp:
                return temp
        
        return temp