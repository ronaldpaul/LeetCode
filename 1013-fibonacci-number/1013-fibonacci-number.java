class Solution {
    public int fib(int n) {
        if (n < 2) {
            return n;
        } else {
            n = fib(n-1) + fib(n-2);
        }
        return n;
    }
}
