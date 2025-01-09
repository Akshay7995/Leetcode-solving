class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        l = []
        strs.sort()
        first = strs[0]
        last = strs[len(strs)-1]
        for i in range(0 , min(len(first),len(last))):
            if(first[i]!=last[i]):
                return ''.join(l)
            l.append(first[i])
        return ''.join(l)
