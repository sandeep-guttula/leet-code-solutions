class Solution {
    public boolean isPalindrome(int n) {
        int temp = n;
        int reverse = 0;
        while(temp > 0){
            int rem = temp%10;
            reverse = (reverse*10)+rem;
            temp = temp/10;
        }
        if(reverse == n ){
            return true;
        } else {
            return false;
        }
    }
}