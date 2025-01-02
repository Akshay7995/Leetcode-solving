class Solution:
    def vowelStrings(self, words: List[str], queries: List[List[int]]) -> List[int]:
        vowels = {'a','e','i','o','u'}
        n = len(words)
        prefix = [0]*(n+1)
        for i in range(n):
            word = words[i]
            isvowelstring = word[0] in vowels and word[-1] in vowels
            prefix[i+1] = prefix[i]+(1 if isvowelstring else 0)
        ans=[]
        for start,end in queries:
            ans.append(prefix[end+1]-prefix[start])
        return ans
