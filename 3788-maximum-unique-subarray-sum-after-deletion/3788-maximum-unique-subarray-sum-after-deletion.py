class Solution:
    def maxSum(self, nums: List[int]) -> int:
        max_val = max(nums)
        if max_val<=0:
            return max_val
        dict = {}
        ans = 0
        for num in nums:
            dict[num] = dict.get(num,0)+1
        
        for key,value in dict.items():
            if key>0 and value>=1:
                ans+=key
        return ans