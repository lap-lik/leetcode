class Solution {
    public int titleToNumber(String columnTitle) {
        int res = 0;
        int step = 0;
        for (int i = columnTitle.length() - 1; i >= 0; i--) {

            int charNumber = columnTitle.charAt(i) - 'A' + 1;;
            int pow = (int) Math.pow(26, step);
            res += charNumber * pow;
            step++;
        }
        return res;
    }
}