class Solution:
    def search(self, nums: List[int], target: int) -> int:
        #nums.sort()
        for i in range(0,len(nums)):
            if(nums[i] == target):
                return i
        
        return -1