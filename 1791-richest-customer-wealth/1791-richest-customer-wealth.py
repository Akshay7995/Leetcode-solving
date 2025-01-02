class Solution:
    def maximumWealth(self, accounts: List[List[int]]) -> int:
        ans=[]
        length = len(accounts)
        for i in range(length):
            innerlength = len(accounts[i])
            sum = 0
            for j in range(innerlength):
                sum +=accounts[i][j]
            ans.append(sum)
        ans.sort()
        return ans[-1]