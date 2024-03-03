class Solution {
    public int mySqrt(int x) {

        if (x == 0 || x == 1) {
            return x;
        }
        long res = x / 2;

        while (true) {
            long temp = res * res;
            if (temp == x) {
                break;
            }
            if (temp > x){
                res = res/2;
            }
            if (temp < x){
                res++;
                if (res*res == x){
                    break;
                }
                if (res*res > x){
                    res--;
                    break;
                }
            }
        }
        return (int) res;
    }
}