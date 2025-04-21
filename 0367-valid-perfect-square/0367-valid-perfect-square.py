class Solution:
    def isPerfectSquare(self, num: int) -> bool:
        if num<0:
            return False
        """number = int(num**0.5)+1
        for i in range(1,number):
            if i*i == num:
                return True
        return False"""
        number = int(math.sqrt(num))
        if number*number == num:
            return True
        return False