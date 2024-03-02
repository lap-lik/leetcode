class Solution {
    public String addBinary(String a, String b) {
        StringBuilder res = new StringBuilder();
        int aLength = a.length();
        int bLength = b.length();
        int maxLength = Math.max(aLength, bLength);
        int temp = 0;
        for (int i = 0; i < maxLength; i++) {
            int aTemp = 0;
            int bTemp = 0;
            if (i < aLength){
                aTemp = a.charAt(aLength-1-i) - '0';
            } else {
                aTemp = 0;
            }
            if (i < bLength){
                bTemp = b.charAt(bLength-1-i) - '0';
            } else {
                bTemp = 0;
            }
            int sumTemp = aTemp + bTemp + temp;
            res.append(sumTemp % 2);
            temp = sumTemp / 2;
        }
        if (temp == 1) {
            res.append(temp);
        }
        return res.reverse().toString();
    }
}