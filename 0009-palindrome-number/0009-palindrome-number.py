class Solution:
    def isPalindrome(self, x: int) -> bool:
        if x<0:
            return False
        original = x
        temp = 0
        while x>0:
            rem = x%10
            x = x//10
            temp = temp*10+rem

        return original==temp
        