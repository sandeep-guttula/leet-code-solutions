class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int arr[] = {-1,-1};
        int low = 0;
        int high = numbers.length-1;
        while(low<= high){
            if(numbers[low] + numbers[high] == target ){
                arr[0] = low +1;
                arr[1] = high+1;
                return arr;
            } else if(numbers[low] + numbers[high] > target ){
                high--;
            } else {
                low++;
            }
        }
        return arr;
    }
}