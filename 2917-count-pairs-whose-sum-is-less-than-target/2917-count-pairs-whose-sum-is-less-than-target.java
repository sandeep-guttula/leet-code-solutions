class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int res = 0;
        for(int i = 0; i< nums.size(); i++){
            for(int j = 0; j<nums.size(); j++){
                if(i!=j){
                    System.out.println("nums[i]: "+nums.get(i)+" nums[j]: "+nums.get(j));
                    System.out.println("i: "+i+" j: "+j);
                    System.out.println();
                    if(nums.get(i) + nums.get(j) < target){
                        res++;
                    }
                }
            } 
        }
        return res/2;
    }
}