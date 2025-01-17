class Solution:
    def searchRange(self, nums: List[int], target: int) -> List[int]:
        def helper1(nums,target):
            start = 0
            end = len(nums)-1
            index1 = -1
            while(start<=end):
                mid = (start+end)//2
                if nums[mid] >= target:
                    end = mid-1
                else:
                    start = mid+1
                if nums[mid] == target:
                    index1 = mid
            return index1

        def helper2(nums,target):
            start = 0
            end = len(nums)-1
            index2 = -1
            while(start<=end):
                mid = (start+end)//2
                if nums[mid]<=target:
                    start = mid+1
                else:
                    end = mid-1
                if(nums[mid]==target):
                    index2 = mid
            return index2

        
        ans = [0]*2
        ans[0] = helper1(nums,target)
        ans[1] = helper2(nums,target)
        return ans