class Solution:
    def divideArray(self, nums: List[int]) -> bool:
        nums.sort()
        i ,j = 0,1
        count = 0
        while j<=len(nums):
            print(i,j)
            if nums[i] == nums[j]:
                count += 1
            i += 2
            j += 2
        return count == (len(nums)//2)