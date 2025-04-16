class Solution:
    def kidsWithCandies(self, candies: List[int], extraCandies: int) -> List[bool]:
        maximum = max(candies)
        ans = [False]*len(candies)
        for i in range (0,len(candies)):
            temp = candies[i]+extraCandies
            if(temp>=maximum):
                ans[i] = True
        
        return ans