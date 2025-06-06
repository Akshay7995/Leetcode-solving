class Solution:
    def generateMatrix(self, n: int) -> List[List[int]]:
        matrix = [[0 for _ in range(n)]for _ in range(n)]
        val = 1
        row_start = 0
        row_end = len(matrix)-1
        col_start = 0
        col_end = len(matrix[0])-1
        while row_start<=row_end and col_start<=col_end:
            for i in range(col_start,col_end+1):
                matrix[row_start][i] = val
                val+=1
            row_start+=1
            for i in range(row_start,row_end+1):
                matrix[i][col_end]=val
                val+=1
            col_end-=1
            if row_start<=row_end:
                for i in range(col_end,col_start-1,-1):
                    matrix[row_end][i] = val
                    val+=1
                row_end-=1
            if col_start<=col_end:
                for i in range(row_end,row_start-1,-1):
                    matrix[i][col_start] = val
                    val+=1
                col_start+=1
            
        return matrix