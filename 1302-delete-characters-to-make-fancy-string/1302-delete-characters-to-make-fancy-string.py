class Solution:
    def makeFancyString(self, s: str) -> str:
        """l = len(s)
        count = 1
        ans = []
        ans.append(s[0])
        for i in range(1,l):
            if s[i-1] == s[i]:
                count+=1
            else:
                count = 1
            
            if count<=2:
                ans.append(s[i])
        
        result = "".join(ans)
        return result"""

        ans = []
        for c in s:
            if len(ans)>=2 and ans[-1]==c and ans[-2]==c:
                continue
            ans.append(c)
        return "".join(ans)
