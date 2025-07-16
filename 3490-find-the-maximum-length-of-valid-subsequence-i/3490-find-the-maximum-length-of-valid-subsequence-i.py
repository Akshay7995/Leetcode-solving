class Solution:
    def maximumLength(self, nums: List[int]) -> int:
        if len(nums) == 2:
            return 2
        even = 0
        odd = 0
        for num in nums:
            if num%2 == 0:
                even+=1
            else:
                odd+=1
        
        even_dp = 0
        odd_dp = 0
        for num in nums:
            if num%2 == 0:
                even_dp = max(even_dp,odd_dp+1)
            else:
                odd_dp = max(even_dp+1,odd_dp)
        
        return max(even,odd,even_dp,odd_dp)