class Solution:
    def xorAllNums(self, nums1: List[int], nums2: List[int]) -> int:
        len1,len2 = len(nums1),len(nums2)
        x1,x2 = 0,0
        if len1%2 !=0:
            for i in nums2:
                x2 = x2^i
        if len2%2 !=0:
            for i in nums1:
                x1 = x1^i
        return x1^x2