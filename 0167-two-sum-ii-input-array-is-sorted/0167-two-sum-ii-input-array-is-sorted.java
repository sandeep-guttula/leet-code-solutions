class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int arr[] = {-1,-1};
        int n = numbers.length;
        for(int i = 0; i<n; i++){
            int low = i+1;
            int high = n-1;
            while(low<= high){
                int mid = (low +high)/2;
                if(numbers[mid] == target-numbers[i]){
                    arr[0] = i+1;
                    arr[1] = mid+1;
                    return arr;
                } else if(numbers[mid] > target-numbers[i]){
                    high = mid-1;
                } else {
                    low = mid +1;
                }
            }
        }
        return arr;
    }
}