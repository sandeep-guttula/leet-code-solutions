class Solution:
    def findDuplicates(self, nums: List[int]) -> List[int]:
        dic = {}
        lst = []
        for i in nums:
            if i not in dic:
                dic[i] = 1
            else:
                dic[i] += 1

        for k,v in dic.items():
            if v != 1:
                lst = lst + [k]
        lst.sort()
        return lst
        