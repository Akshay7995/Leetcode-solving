class Solution:
    def maximumWealth(self, accounts: List[List[int]]) -> int:
        arr = []
        for i in range (0,len(accounts)):
            sum = 0
            for j in range (0,len(accounts[i])):
                sum += accounts[i][j]
            arr.append(sum)
        return max(arr)