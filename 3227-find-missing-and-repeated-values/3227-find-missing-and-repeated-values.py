class Solution:
    def findMissingAndRepeatedValues(self, grid: List[List[int]]) -> List[int]:
        l = set()
        ans = [0,0]
        for i in range (0,len(grid)):
            for j in range(0,len(grid[0])):
                if grid[i][j] in l:
                    ans[0] = grid[i][j]
                else:
                    l.add(grid[i][j])
        
        n = len(grid)*len(grid[0])
        for i in range(1,n+1):
            if i not in l:
                ans[1]=i

        return ans