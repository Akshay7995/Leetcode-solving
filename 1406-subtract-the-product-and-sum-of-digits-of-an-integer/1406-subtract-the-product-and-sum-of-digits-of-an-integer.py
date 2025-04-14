class Solution:
    def subtractProductAndSum(self, n: int) -> int:
        temp = n
        prod = 1
        total = 0
        while temp!=0:
            rem = temp%10
            prod *=rem
            temp = temp//10
        
        temp = n
        while temp!=0:
            rem = temp%10
            total+=rem
            temp = temp//10
        
        ans = prod-total
        return ans