class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int ele=0;
        for(int i =0; i< nums.length; i++){
            if(count == 0){
                count = 1;
                ele = nums[i];
            }
            else if(ele == nums[i]){
                count++;
            } else {
                count--;
            }
        }
        int count_1 = 0;
        for(int i=0;i<nums.length; i++){
            if(nums[i] == ele ){
                count_1++;
            }
        }
        if(count_1 > (nums.length/2)){
            return ele;
        } 
        return -1;
    }
}