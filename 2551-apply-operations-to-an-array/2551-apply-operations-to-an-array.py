class Solution:
    def applyOperations(self, nums: List[int]) -> List[int]:
        n = len(nums)
        for i in range(0,n-1):
            if nums[i] == nums[i+1]:
                nums[i] = nums[i]*2
                nums[i+1] = 0
        
        ans = [ ]
        for i in range(0,n):
            if nums[i] != 0:
                ans.append(nums[i])
        
        while len(ans)<n:
            ans.append(0)

        return ans