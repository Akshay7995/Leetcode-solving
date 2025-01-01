class Solution:
    def getConcatenation(self, nums: List[int]) -> List[int]:
        length = len(nums)
        ans= []
        for i in range(2*length):
            if i<length:
                ans.append(nums[i])
            else:
                ans.append(nums[i%length])
        return ans