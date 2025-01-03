class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        ans = [0]*(m+n)
        i=0
        j=0
        index = 0
        while i<m and j<n:
            if nums1[i]<=nums2[j]:
                ans[index] = nums1[i]
                i +=1
                index+=1
            else:
                ans[index] = nums2[j]
                index+=1
                j+=1
        while i<m:
            ans[index] = nums1[i]
            i +=1
            index +=1
        while j<n:
            ans[index] = nums2[j]
            index +=1
            j +=1
        for i in range(len(ans)):
            nums1[i] = ans[i]
        print(nums1)

        