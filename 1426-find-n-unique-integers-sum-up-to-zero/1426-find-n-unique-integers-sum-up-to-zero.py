class Solution:
    def sumZero(self, n: int) -> List[int]:
        l = []
        if n%2 != 0:
            l.append(0)
        for i in range(n):
            if len(l)!=n:
                l.append(-i-1)
                l.append(i+1)
        
        return l