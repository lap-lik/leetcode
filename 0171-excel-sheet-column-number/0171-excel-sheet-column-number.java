class Solution {
    public int titleToNumber(String columnTitle) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c = 'A'; c <= 'Z'; c++) {
            map.put(c, c - 'A' + 1);
        }

        int res = 0;
        int step = 0;
        for (int i = columnTitle.length() - 1; i >= 0; i--) {

            int charNumber = map.get(columnTitle.charAt(i));
            int pow = (int) Math.pow(26, step);
            res += charNumber * pow;

            step++;
        }

        return res;
    }
}