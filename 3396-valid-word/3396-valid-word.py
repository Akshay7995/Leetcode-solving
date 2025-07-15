class Solution:
    def isValid(self, word: str) -> bool:

        if len(word) < 3 :
            return False
        vowels = 0
        consonents = 0
        vowels_set = "aeiouAEIOU"

        for ch in word:
            if ch.isalpha() :
                if ch in vowels_set:
                    vowels+=1
                else:
                    consonents+=1
            elif not ch.isdigit():
                return False
        
        return vowels>=1 and consonents>=1