class Solution:
    def areAlmostEqual(self, s1: str, s2: str) -> bool:
        dict1 = { }
        for c1 in s1:
            if c1 not in dict1:
                dict1[c1] = 1
            else:
                dict1[c1]+=1
        dict2={ }
        for c2 in s2:
            if c2 not in dict2:
                dict2[c2] = 1
            else:
                dict2[c2]+=1
        ans = dict1.items() == dict2.items()
        if ans == False:
            return False
        
        
        count = 0
        for i in range(0,len(s1)):
            if s1[i]!=s2[i]:
                count+=1
        if count ==0 or count==2:
            return True
        return False