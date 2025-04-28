class Solution:
    def countSubarrays(self, nums: List[int], k: int) -> int:
        ans= 0
        present_sum = 0
        start = 0

        for end in range(len(nums)):
            present_sum += nums[end]
        
            while present_sum*(end-start+1) >= k:
                present_sum -= nums[start]
                start+=1
            
            ans += (end-start+1)
        
        return ans