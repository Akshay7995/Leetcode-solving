class Solution:
    def countAndSay(self, n: int) -> str:
        if n==1:
            return "1"
        num = "1"
        for i in range(1,n):
            counts = self.helper(num)
            num = self.helper2(counts)
        return num
        
    def helper(self,num:str)->list:
        count = 1
        l = []
        for i in range(1,len(num)):
            if num[i] == num[i-1]:
                count+=1
            else:
                l.append((num[i-1],count))
                count = 1
        
        l.append((num[-1],count))
        return l
    
    def helper2(self,l:list)->str:
        ans=""
        for digit,count in l:
            ans += f"{count}{digit}"
        return ans