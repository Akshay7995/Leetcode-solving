class Solution:
    def countPrefixSuffixPairs(self, words: List[str]) -> int:
        count = 0
        def helper(str1:str,str2:str) -> bool:
            n1 = len(str1)
            n2 = len(str2)
            if(n1>n2):
                return False
            return str2.startswith(str1) and str2.endswith(str1)
        for i in range(len(words)):
            for j in range(i+1,len(words)):
                if helper(words[i],words[j]):
                    count+=1
        return count