public class FibonacciDinamico {
    long fibonacci(int n) {
        long []  num = new long[n + 1];
        if (n == 0 || n == 1)
            return n;
        num[0] =0;
        num[1] = 1;
        for (int i = 2; i <= n; i++) {
            num[i] = num[i - 1] + num[i - 2];

        }
        return num[n];
    }
}
