class Solution:
    def shiftingLetters(self, s: str, shifts: List[int]) -> str:
        n = len(shifts)
        for i in range(n-2,-1,-1):
            shifts[i] +=shifts[i+1]
        s = list(s)
        for i in range(len(s)):
            s[i] = chr((ord(s[i]) - ord('a')+shifts[i]) % 26 + ord('a'))
        s = ''.join(s)
        return s