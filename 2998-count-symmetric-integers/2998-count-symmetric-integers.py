class Solution:
    def countSymmetricIntegers(self, low: int, high: int) -> int:
        count = 0
        for i in range(low,high+1):
            str_num = str(i)
            length = len(str_num)
            if length%2 != 0:
                continue
            if self.helper(str_num):
                count+=1
        
        return count
     
    def helper(self,num:str) -> bool:
        frst = 0
        scd = 0
        len_str = len(num)
        for i in range(0,len_str//2):
            frst += int(num[i])
        
        for j in range(len_str//2,len_str):
            scd += int(num[j])
        
        if (frst == scd):
            return True
        
        return False