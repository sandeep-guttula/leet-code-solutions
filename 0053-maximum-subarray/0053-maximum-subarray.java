class Solution {
    public int maxSubArray(int[] arr) {
        int n = arr.length;
        long maxi = Long.MIN_VALUE; 
        long sum = 0;

        for (int i = 0; i < n; i++) {

            sum += arr[i];

            if (sum > maxi) {
                maxi = sum;
            }

            if (sum < 0) {
                sum = 0;
            }
        }
        return (int) maxi;
    }
}