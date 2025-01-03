class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        dict={}
        for i in nums:
            if i in dict:
                dict[i] +=1
            else:
                dict[i] = 1
        max_count = 0
        max_element =0
        for num,count in dict.items():
            if count > max_count:
                max_count = count
                max_element = num
        return max_element
        
