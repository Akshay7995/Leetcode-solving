class Solution:
    def runningSum(self, nums: List[int]) -> List[int]:
        sum = 0
        n = len(nums)
        ans=[]
        for i in range(n):
            sum = sum+nums[i]
            ans.append(sum)
        return ans


        