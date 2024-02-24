class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            int temp = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (temp + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }
}