class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        #nums.sort()
        #print(nums)
        n = len(nums)
        for i in range(0,n-1):
            for j in range(0,n-i-1):
                if nums[j] > nums[j+1]:
                    temp = nums[j]
                    nums[j] = nums[j+1]
                    nums[j+1] = temp
        print(nums)
