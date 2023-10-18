class Solution {
    public int[] findRightInterval(int[][] intervals) {
        int n = intervals.length;
        int[] ans  = new int[n];
        for(int i = 0; i<n; i++){
            int min = Integer.MAX_VALUE;
            int index = -1;
            for(int j = 0; j<n;j++){
                if(intervals[i][1] <= intervals[j][0] && min >= intervals[j][0] ){
                    index = j;
                    min = intervals[j][0];
                }
            }
            ans[i] = index;
        }
        return ans;
    }
}