class Solution {
    public int splitArray(int[] nums, int k) {
        int ans = 0;
        int low = 0;
        int high = 0;
        for (int num : nums) {
            low = Math.max(low, num);
            high += num;
        }
        
        while(low<= high){
            int mid = (low+high)/2;
            int n = num_of_sub_arrays(nums,mid);
            if(n > k){
                low = mid+1;
            } else {
                ans = mid;
                high = mid-1;
            }
        }
        return ans;
    }

    public static int num_of_sub_arrays(int[] arr, int mid){
        int sum = 0;
        int count = 1;
        for (int i : arr) {
            if(sum+i > mid){
                sum = i;
                count++;
            } else {
                sum+= i;
            }
        }
        return count;
    }
}