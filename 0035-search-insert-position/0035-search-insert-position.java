class Solution {
    public int searchInsert(int[] nums, int target) {
        int l = 0;
        int h = nums.length-1;
        int ans = nums.length;
        while(l<=h){
            int mid = (l+h)/2;
            if(target <= nums[mid]){
                ans = mid;
                h = mid-1;
            } else {
                l = mid +1;
            }
        }
        return ans;
    }
}