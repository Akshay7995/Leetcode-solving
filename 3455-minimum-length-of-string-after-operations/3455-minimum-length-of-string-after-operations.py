class Solution:
    def minimumLength(self, s: str) -> int:
        arr=[0]*26
        for ch in s:
            arr[ord(ch)-ord('a')] +=1
        
        for i in range(0,26):
            while arr[i]>=3:
                arr[i] -=2
        

        ans = 0
        for i in range(0,26):
            ans +=arr[i]
        
        return ans