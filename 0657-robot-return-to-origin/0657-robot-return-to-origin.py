class Solution:
    def judgeCircle(self, moves: str) -> bool:
        x = 0
        y = 0
        for i in range(len(moves)):
            if moves[i] =="U" :
                y +=1
            elif moves[i] == "D":
                y -=1
            elif moves[i] == "R":
                x +=1
            else:
                x -=1
        
        if x==0 and y==0:
            return True
        return False