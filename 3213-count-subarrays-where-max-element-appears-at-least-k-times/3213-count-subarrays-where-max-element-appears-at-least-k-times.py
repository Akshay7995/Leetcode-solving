class Solution:
    def countSubarrays(self, nums: List[int], k: int) -> int:
        ans = 0
        left = 0
        temp_count = 0
        high = max(nums)
        for right in range(len(nums)):
            if nums[right]==high:
                temp_count+=1
            while temp_count == k:
                ans += len(nums)-right
                if nums[left] == high:
                    temp_count -=1
                left+=1
        
        return ans