class Solution:
    def restoreString(self, s: str, indices: List[int]) -> str:
        str = ['']*len(s)
        for i in range(len(str)):
            str[indices[i]] = s[i]
        str = ''.join(str)
        return str