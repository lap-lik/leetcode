class Solution {
    public boolean isPalindrome(int x) {
        boolean flag = false;
        String num = "" + x;
        for (int i = 0, j = num.length()-1; i < num.length(); i++, j--) {
            if (num.charAt(i) != num.charAt(j)){
                return flag;
            }
        }
        return true;
    }
}