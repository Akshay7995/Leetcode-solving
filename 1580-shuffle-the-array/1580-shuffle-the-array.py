class Solution:
    def shuffle(self, nums: List[int], n: int) -> List[int]:
        left = 0
        right = n
        index = 0
        ans = [0]*(2*n)
        while left<n:
            ans[index] = nums[left]
            index +=1
            left +=1
            ans[index] = nums[right]
            index +=1
            right +=1
        return ans