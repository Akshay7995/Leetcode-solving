class Solution:
    def canReach(self, s: str, minJump: int, maxJump: int) -> bool:
        n = len(s)
        if s[-1]=='1':
            return False
        window_sum = 0
        reachable = [False]*n
        reachable[0] = True
        for i in range(1,n):
            if (i-minJump >= 0):
                window_sum +=reachable[i-minJump]
            if (i-maxJump-1 >= 0):
                window_sum -= reachable[i-maxJump-1]
            if window_sum >0 and s[i]=='0':
                reachable[i] = True
        return reachable[-1]