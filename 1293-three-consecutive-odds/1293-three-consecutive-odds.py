class Solution:
    def threeConsecutiveOdds(self, arr: List[int]) -> bool:
        #temp = []
        count = 0
        for num in arr:
            if count==3:
                return True
            if num%2 == 0:
                count = 0
            else:
                #temp.append(num)
                count+=1
        if count>=3:
            return True
        #print(temp)
        return False