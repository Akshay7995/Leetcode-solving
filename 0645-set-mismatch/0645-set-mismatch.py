class Solution:
    def findErrorNums(self, nums: List[int]) -> List[int]:
        my_set = set()
        for num in nums:
            if num not in my_set:
                my_set.add(num)
            else:
                duplicate = num
        
        for i in range(1,len(nums)+1):
            if i not in my_set:
                missing = i
                break
        
        return [duplicate,missing]