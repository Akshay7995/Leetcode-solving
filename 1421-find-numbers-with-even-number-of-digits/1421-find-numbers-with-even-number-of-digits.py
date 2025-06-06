class Solution:
    def findNumbers(self, nums: List[int]) -> int:
        ans = 0
        for num in nums:
            count = 0
            while num>0:
                num = num//10
                count+=1
            
            if count%2 == 0:
                ans+=1
        
        return ans