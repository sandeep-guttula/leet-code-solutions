import java.util.Collections;

class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> list = new ArrayList<Integer>(); 
        for(int i=0;i<nums.length;i++){
            list.add(nums[i]);
        }
        Collections.sort(list);
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == target) {
                result.add(i);
            }
        }

        return result;
    }

}