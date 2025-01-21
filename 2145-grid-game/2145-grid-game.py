class Solution:
    def gridGame(self, grid: List[List[int]]) -> int:
        n = len(grid[0])
        sumRow0 = sum(grid[0])
        sumRow1 = 0
        result = float('inf')
        
        for i in range(n):
            sumRow0 -= grid[0][i]
            result = min(result, max(sumRow0, sumRow1))
            sumRow1 += grid[1][i]
        
        return result
