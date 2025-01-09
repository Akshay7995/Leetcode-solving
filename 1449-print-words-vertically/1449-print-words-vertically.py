class Solution:
    def printVertically(self, s: str) -> List[str]:
        words = s.split()
        max_len = max(len(word) for word in words)
        ans = []
        for i in range(max_len):
            row = []
            for word in words:
                if i<len(word):
                    row.append(word[i])
                else:
                    row.append(" ")
            ans.append(''.join(row).rstrip())
        return ans