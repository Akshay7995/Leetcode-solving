class Solution:
    def waysToSplitArray(self, nums: List[int]) -> int:
        total_sum = 0
        for num in nums:
            total_sum +=num
        count = 0
        present_sum = 0
        for i in range(0,len(nums)-1):
            present_sum +=nums[i]
            remaining_sum = total_sum - present_sum
            if present_sum >= remaining_sum:
                count+=1
        return count