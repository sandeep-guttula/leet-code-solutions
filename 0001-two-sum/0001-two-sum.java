class Solution {
    public int[] twoSum(int[] book, int target) {
        int[] arr = new int[2];
        int n = book.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(book[i], i);
        }

        for (int i = 0; i < n; i++) {
            int temp = target - book[i];
            if(map.containsKey(temp) && map.get(temp) != i ){
                arr[0] = i;
                arr[1] = map.get(target - book[i]);
                return arr;
            }
        }
        return new int[]{};
    }
}