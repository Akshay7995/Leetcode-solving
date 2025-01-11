class Solution:
    def wordSubsets(self, words1: List[str], words2: List[str]) -> List[str]:
        dict2 = Counter()
        for word in words2:
            freq = Counter(word)
            for char in freq:
                dict2[char] = max(dict2[char],freq[char])

        ans = []
        for word in words1:
            freq = Counter(word)
            is_universal = True
            for char in dict2:
                if freq[char] < dict2[char]:
                    is_universal = False
                    break
            if is_universal :
                ans.append(word)
        return ans