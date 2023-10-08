class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] preFix = new int[n];
        int[] suFix = new int[n];

        preFix[0] = 1;
        suFix[n-1]=1;
        for(int i = 1; i< n;i++){
            preFix[i] = preFix[i-1]*nums[i-1];
        }
        for(int i = n-2; i >= 0;i--){
            suFix[i] = suFix[i+1]*nums[i+1];
        }

        for(int i = 0; i< n;i++){
            preFix[i] = preFix[i]*suFix[i];
        }
        return preFix;

    }
}