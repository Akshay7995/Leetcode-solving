class Solution:
    def checkString(self, s: str) -> bool:
        """count = 0
        for chr in s:
            if chr == 'a':
                count+=1
        
        cou_a = 0
        for chr in s:
            if chr == 'a':
                cou_a+=1
            elif chr == 'b':
                if cou_a == count:
                    return True

        return cou_a == count"""
        return False if 'ba' in s else True