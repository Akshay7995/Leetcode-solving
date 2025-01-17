class Solution:
    def doesValidArrayExist(self, derived: List[int]) -> bool:
        n = len(derived)
        original = [0]*n
        for i in range(1,n):
            original[i] = derived[i-1]^original[i-1]
        
        for i in range(0,n):
            index = (i+1)%n
            if derived[i] != (original[i]^original[index]):
                return False
        
        return True