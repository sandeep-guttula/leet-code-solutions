class Solution:
    def pivotIndex(self, nums: List[int]) -> int:
        ls = 0
        rs = sum(nums)
        for i in range(len(nums)):
            ls += nums[i]
            if ls == rs:
                 return i
            rs -= nums[i]
        return -1

