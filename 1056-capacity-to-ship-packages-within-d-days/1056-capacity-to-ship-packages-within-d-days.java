class Solution {

    static int noOfDays(int[] arr, int capacity){
        int count = 1;
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            if(sum + arr[i] > capacity ){
                count += 1;
                sum = arr[i];
            } else {
                sum += arr[i];
            }
        }
        return count;
    }

    public int shipWithinDays(int[] weights, int days) {
        int n = weights.length;
        int low = Integer.MIN_VALUE;
        int high = 0;
        for(int i = 0; i<n ; i++ ){
            low = Math.max(weights[i],low);
            high += weights[i];
        }
        while(low <= high){
            int mid = (low + high)/2;
            if(noOfDays(weights,mid) <= days){
                high = mid-1;
            } else {
                low = mid+1;
            }
        }
        return low;
    }
}