class Solution:
    def findPeakElement(self, nums: List[int]) -> int:
        temp = nums.copy()
        nums.sort()
        number = nums[len(nums)-1]
        for i in range(0,len(temp)):
            if temp[i] == number:
                return i
        
        return -1