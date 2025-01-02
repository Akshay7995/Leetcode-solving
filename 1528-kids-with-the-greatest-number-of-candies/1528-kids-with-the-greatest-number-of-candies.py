class Solution:
    def kidsWithCandies(self, candies: List[int], extraCandies: int) -> List[bool]:
        higest = max(candies)
        bool_array = []
        for i in range(len(candies)):
            if candies[i]+extraCandies >=higest:
                bool_array.append(True)
            else:
                bool_array.append(False)
        return bool_array