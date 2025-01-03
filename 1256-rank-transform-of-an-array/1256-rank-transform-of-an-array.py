class Solution:
    def arrayRankTransform(self, arr: List[int]) -> List[int]:
        dict = {}
        temp = sorted(list(set(arr)))
        for i in range(len(temp)):
            dict[temp[i]] = i+1
        for i in range(len(arr)):
            arr[i] = dict[arr[i]]
        return arr
        