class Solution {
    public String longestCommonPrefix(String[] strs) {
        String res = "";
        for (int i = 0; i < strs[0].length(); i++) {
            String temp = "";
            for (int k = 0; k < strs.length; k++) {
                temp = "" + strs[0].charAt(i);
                if (strs[k].length()-1 < i) {
                    return res;
                }
                if (!temp.equals(String.valueOf(strs[k].charAt(i)))) {
                    return res;
                }
            }
            res = res + temp;
        }
        return res;
    }
}