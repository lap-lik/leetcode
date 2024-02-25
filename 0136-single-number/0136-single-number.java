class Solution {
    public int singleNumber(int[] nums) {
        List<Integer> arr = new ArrayList<>();
        if (nums.length == 1) {
            return nums[0];
        }
        for (int i = 0; i < nums.length; i++) {
            Integer temp = nums[i];
            if (arr.contains(temp)){
                arr.remove(temp);
            } else {
                arr.add(temp);
            }
        }
        return arr.get(0);
    }
}