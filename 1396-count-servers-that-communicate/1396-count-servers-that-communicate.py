class Solution:
    def countServers(self, grid: List[List[int]]) -> int:
        row = [0]*(len(grid))
        col = [0]*(len(grid[0]))

        for i in range(0,len(grid)):
            for j in range(0,len(grid[0])):
                row[i] +=grid[i][j]
                col[j] +=grid[i][j]

        ans= 0
        for i in range(0,len(grid)):
            for j in range(0,len(grid[0])):
                if grid[i][j]==1 and (row[i]>1 or col[j]>1):
                    ans+=1
        
        return ans