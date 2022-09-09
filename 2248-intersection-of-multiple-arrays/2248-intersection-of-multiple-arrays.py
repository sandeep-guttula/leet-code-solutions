class Solution:
    def intersection(self, nums: List[List[int]]) -> List[int]:
        lst = []
        dic = {}
        count = 0
        for i in nums:
            count += 1
            for j in i:
                if j not in dic:
                    dic[j] = 1
                else:
                    dic[j] += 1
        for k,v in dic.items():
            if v == count:
                lst += [k]
        lst.sort()
        return lst