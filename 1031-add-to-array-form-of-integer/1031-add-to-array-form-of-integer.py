class Solution:
    def addToArrayForm(self, num: List[int], k: int) -> List[int]:
        temp = 0
        for i in range (len(num)):
            temp = temp*10 + num[i]

        number = temp+k
        ans = []
        while(number>0):
            rem = number%10
            number = number//10
            ans.insert(0,rem)
        
        return ans