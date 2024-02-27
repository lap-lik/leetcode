class Solution {
    public int fib(int n) {
                if (n <= 1){
            return n;
        }

        int first = 0;
        int second = 1;
        int res = 0;
        while (res < n){
            int temp = first;
            first = second;
            second = temp + second;
            res++;
        }
        return first;
    }
}