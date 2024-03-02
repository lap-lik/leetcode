class Solution {
    public boolean isPalindrome(int x) {
        String num = String.valueOf(x);
        StringBuilder numRevers = new StringBuilder(num).reverse();
        return num.equals(numRevers.toString());
    }
}