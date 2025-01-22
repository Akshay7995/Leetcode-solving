class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        leftprod = [1]*len(nums)
        rightprod = [1]*len(nums)
        result = [0]*len(nums)

        for i in range(1,len(nums)):
            leftprod[i] = leftprod[i-1]*nums[i-1]

        for i in range(len(nums)-2,-1,-1):
            rightprod[i] = rightprod[i+1]*nums[i+1]

        for i in range(0,len(nums)):
            result[i] = leftprod[i]*rightprod[i]

        return result