class Solution:
    def canMakeArithmeticProgression(self, arr: List[int]) -> bool:
        temp = sorted(list(arr))
        diff = temp[1]-temp[0]
        for i in range(1,len(arr)-1):
            if temp[i+1]-temp[i] != diff:
                return False
        return True