class Solution:
    def maxSubsequence(self, nums: List[int], k: int) -> List[int]:
        temp = []
        for num in nums:
            temp.append(num)
        temp.sort(reverse=True)
        top_k_values = temp[:k]

        count = {}
        for number in top_k_values:
            count[number] = count.get(number,0)+1
        
        ans = []
        for num in nums:
            if num in count and count[num]>0:
                ans.append(num)
                count[num]-=1
                if len(ans)== k:
                    break
        
        return ans