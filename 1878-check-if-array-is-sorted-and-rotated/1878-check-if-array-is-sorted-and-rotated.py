class Solution:
    def check(self, nums: List[int]) -> bool:
        countbreak = 0
        for i in range(0,len(nums)):
            if nums[i]>nums[(i+1)%len(nums)]:
                countbreak+=1
        
        if countbreak >1 :
            return False
        
        return True