class Solution:
    def generateMatrix(self, n: int) -> List[List[int]]:
        rows = n
        cols = n
        arr = [[0 for _ in range(cols)] for _ in range(rows)]
        top = 0
        bottom = len(arr)-1
        left = 0
        right = len(arr[0])-1

        val=1
        while top<=bottom and left<=right:
            for i in range(left,right+1):
                arr[top][i] = val
                val+=1
            top+=1
            for i in range(top,bottom+1):
                arr[i][right] = val
                val+=1
            right-=1
            if top<=bottom:
                for i in range(right,left-1,-1):
                    arr[bottom][i] = val
                    val+=1
                bottom-=1
            if left<=right:
                for i in range(bottom,top-1,-1):
                    arr[i][left] = val
                    val+=1
                left+=1

        return arr 