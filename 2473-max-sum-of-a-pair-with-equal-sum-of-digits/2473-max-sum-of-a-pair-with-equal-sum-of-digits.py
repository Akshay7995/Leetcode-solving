class Solution:
    def maximumSum(self, nums: List[int]) -> int:
        maxsum = -1
        dict = { }
        for i in range(0,len(nums)):
            temp1 = 0
            num = nums[i]
            while num>0 :
                temp1 += num%10
                num = num//10
            
            if temp1 in dict:
                sum = dict[temp1]+nums[i]
                maxsum = max(maxsum,sum)
                dict[temp1] = max(dict[temp1],nums[i])

            else:
                dict[temp1]=nums[i]

        return maxsum