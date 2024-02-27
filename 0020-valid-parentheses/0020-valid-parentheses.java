class Solution {
    public boolean isValid(String s) {
       while (s.contains("()") || s.contains("[]") || s.contains("{}")) {
            s = s.replaceAll("\\(\\)", "")
                .replaceAll("\\[\\]", "")
                .replaceAll("\\{\\}", "");
        }
        return s.isEmpty();
    }
}