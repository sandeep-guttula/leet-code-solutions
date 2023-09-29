class Solution {
    public char nextGreatestLetter(char[] arr, char target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low+high) / 2;
            if (target < arr[mid] ) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return arr[low% arr.length];
    }
}