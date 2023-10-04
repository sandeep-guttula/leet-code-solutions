class Solution {
    public int maxEl(int[] piles) {
        int maxi = Integer.MIN_VALUE;
        for (int i = 0; i < piles.length; i++) {
            maxi = Math.max(maxi, piles[i]);
        }
        return maxi;
    }

    public long totalHours(int[] piles, int hrs) {
        long total = 0;
        for (int i = 0; i < piles.length; i++) {
            total += (piles[i] + hrs - 1) / hrs; // Ceiling division
        }
        return total;
    }

    public int minEatingSpeed(int[] piles, int h) {
        int low = 1, high = maxEl(piles);
        while (low <= high) {
            int mid = low + (high - low) / 2;
            long total = totalHours(piles, mid);
            if (total <= h) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
}