class Solution:
    def isPrefixOfWord(self, sentence: str, searchWord: str) -> int:
        l = list(sentence.split())
        for i in range(0,len(l)):
            if l[i].startswith(searchWord):
                return i+1
        return -1