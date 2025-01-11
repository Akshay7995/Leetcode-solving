class Solution:
    def canConstruct(self, s: str, k: int) -> bool:
        if len(s)<k:
            return False

        dict = {}
        for char in s:
            if char in dict:
                dict[char] +=1
            else:
                dict[char] = 1
        
        count=0
        for key,value in dict.items():
            if value%2 != 0:
                count+=1
        
        if count>k:
            return False

        return True