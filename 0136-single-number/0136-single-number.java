class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> arr = new HashMap<>();
        if (nums.length == 1) {
            return nums[0];
        }
        for (int i = 0; i < nums.length; i++) {
            Integer temp = nums[i];
            if (arr.containsKey(temp)){
                arr.remove(temp);
            } else {
                arr.put(temp, temp);
            }
        }
        return arr.values().stream().findFirst().get();
    }
}