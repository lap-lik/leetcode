class Solution {
    public boolean isValid(String s) {
       int length = s.length();
        for (int i = 0; i < length; i++) {
            s = s.replaceAll("\\(\\)", "")
                    .replaceAll("\\[]", "")
                    .replaceAll("\\{}", "");
        }
        return s.isEmpty();
    }
}