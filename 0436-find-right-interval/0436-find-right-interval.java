class Solution {

    public static int binarySearch(int[] arr, int x) {
        int low = 0;
        int high = arr.length - 1;
        if(arr[high] < x){
            return -1;
        }
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == arr[mid]) {
                return mid;
            } else if (x < arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

   public static int[] findRightInterval(int[][] intervals) {
        int n = intervals.length;
        int[] ans = new int[n];
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] first = new int[n];
        for (int i = 0; i < n; i++) {
            map.put(intervals[i][0], i);
            first[i] = intervals[i][0];
        }
        Arrays.sort(first);
        for (int i = 0; i < n; i++) {
            int key = binarySearch(first, intervals[i][1]);
            if (key == -1) {
                ans[i] = -1;
            } else {
                ans[i] = map.get(first[key]);
            }
        }
        return ans;
    }
}