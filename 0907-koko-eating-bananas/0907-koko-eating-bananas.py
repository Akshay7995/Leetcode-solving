class Solution:
    def minEatingSpeed(self, piles: List[int], h: int) -> int:
        #for clarity refer this - https://leetcode.com/problems/koko-eating-bananas/solutions/1703687/java-c-a-very-very-well-detailed-explanation

        def helper(piles:List[int],k:int,h:int) ->bool:
            hours = 0
            for pile in piles:
                div = pile//k
                hours +=div
                if pile%k != 0:
                    hours+=1
            return hours<=h

        left = 1
        right = 1000000000
        while left<=right:
            mid = right +(left-right)//2
            if helper(piles,mid,h):
                right = mid-1
            else:
                left = mid+1
        return left
        