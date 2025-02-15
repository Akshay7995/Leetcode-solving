class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        #HashMap< , > hm = new HashMap<>();
        dict = { }
        n = len(nums)
        for num in nums:
            if num in dict:
                dict[num] += 1
            else:
                dict[num] = 1 
            

        temp = n/2
        #max_num = 0

        for key,value in dict.items():
            if value > temp:
                #max_num = key
                return key

        return -1
        
        