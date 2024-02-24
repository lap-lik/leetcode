class Solution {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i]++;
            if (digits[i] != 10) {
                return digits;
            } else {
                digits[i] = 0;
                if (i == 0) {
                    digits = new int[digits.length + 1];
                    digits[i]++;
                }
            }
        }
        return digits;
    }
}