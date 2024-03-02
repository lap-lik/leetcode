class Solution {
    public boolean isPalindrome(int x) {
        String num = "" + x;
        for (int i = 0, j = num.length()-1; i < num.length(); i++, j--) {
            if (num.charAt(i) != num.charAt(j)){
                return false;
            }
        }
        return true;
    }
}