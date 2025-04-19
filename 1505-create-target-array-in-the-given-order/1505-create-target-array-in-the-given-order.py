class Solution:
    def createTargetArray(self, nums: List[int], index: List[int]) -> List[int]:
        ans = []
        i = 0
        j = 0
        while i<len(nums) and j<len(index):
            ans.insert(index[j],nums[i])
            i+=1
            j+=1
        return ans
