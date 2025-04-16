class Solution:
    def shuffle(self, nums: List[int], n: int) -> List[int]:
        """ans = [ ]
        i=0
        j=len(nums)//2
        while(j<len(nums)):
            ans.append(nums[i])
            ans.append(nums[j])
            i+=1
            j+=1
        
        return ans"""
        ans = [0]*len(nums)
        i=0
        j=len(nums)//2
        pointer = 0
        while(j<len(nums)):
            ans[pointer] = nums[i]
            i+=1
            pointer+=1
            ans[pointer]=nums[j]
            pointer+=1
            j+=1
        
        return ans