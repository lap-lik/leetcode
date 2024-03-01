class Solution {
    public int searchInsert(int[] nums, int target) {
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target){
                return res;
            }
            if (nums[i] < target){
                res++;
                if (i == nums.length-1){
                    return res++;
                }
            }
            if (nums[i] > target){
                return res;
            }
        }
        res++;
        return res;
    }
}