class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int top = nums1.length - 1;
        int left = m - 1;
        int right = n - 1;
        while (right >= 0) {
            if(left<0 || nums2[right] >= nums1[left]) {
                nums1[top] = nums2[right];
                right--;
            } else {
                nums1[top] = nums1[left];
                left--;
            }
            top--;
        }
    }
}