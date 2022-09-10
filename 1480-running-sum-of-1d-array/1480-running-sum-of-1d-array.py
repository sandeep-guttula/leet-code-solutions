class Solution:
    def runningSum(self, nums: List[int]) -> List[int]:
        lst = [nums[0]]
        temp = nums[0]
        for i in range(1,len(nums)):
            temp += nums[i]
            lst = lst + [temp]
        return lst