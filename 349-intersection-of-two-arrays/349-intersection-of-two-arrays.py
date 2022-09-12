class Solution:
    def intersection(self, nums1: List[int], nums2: List[int]) -> List[int]:
        lst = []
        for i in range(len(nums1)):
            if nums1[i] in nums2:
                if nums1[i] not in lst:
                    lst = lst + [nums1[i]]
        return lst