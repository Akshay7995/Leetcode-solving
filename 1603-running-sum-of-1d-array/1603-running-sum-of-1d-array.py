class Solution:
    def runningSum(self, nums: List[int]) -> List[int]:
        ans = [0]*len(nums)
        sum = 0
        for i in range(len(nums)):
            sum += nums[i]
            ans[i] = sum
        return ans