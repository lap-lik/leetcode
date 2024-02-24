class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> romanNums = new HashMap<>();
        romanNums.put('I', 1);
        romanNums.put('V', 5);
        romanNums.put('X', 10);
        romanNums.put('L', 50);
        romanNums.put('C', 100);
        romanNums.put('D', 500);
        romanNums.put('M', 1000);
        int res = 0;
        List<Integer> nums = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            nums.add(romanNums.get(s.charAt(i)));
        }
        for (int i = 0; i < nums.size(); i++) {
            if (i < nums.size() - 1 && nums.get(i) < nums.get(i + 1)) {
                res += nums.get(i + 1) - nums.get(i);
                i += 1;
            } else if (i < nums.size() - 1 && Objects.equals(nums.get(i), nums.get(i + 1))) {
                int temp = nums.get(i) + nums.get(i + 1);
                if (i < nums.size() - 2 && Objects.equals(nums.get(i + 1), nums.get(i + 2))) {
                    res += temp + nums.get(i + 2);
                    i += 2;
                } else {
                    res += temp;
                    i += 1;
                }
            } else {
                res += nums.get(i);
            }
        }
        return res;
    }
}