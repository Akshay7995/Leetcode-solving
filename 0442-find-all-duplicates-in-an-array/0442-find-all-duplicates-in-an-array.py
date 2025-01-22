class Solution:
    def findDuplicates(self, nums: List[int]) -> List[int]:
        s = set()
        ans = []
        for num in nums:
            if num not in s:
                s.add(num)
            else:
                ans.append(num)

        return ans